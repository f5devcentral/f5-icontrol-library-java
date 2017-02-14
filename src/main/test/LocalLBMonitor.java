/*
 * The contents of this file are subject to the "END USER LICENSE AGREEMENT FOR F5
 * Software Development Kit for iControl"; you may not use this file except in
 * compliance with the License. The License is included in the iControl
 * Software Development Kit.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
 * the License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is iControl Code and related documentation
 * distributed by F5.
 *
 * The Initial Developer of the Original Code is F5 Networks,
 * Inc. Seattle, WA, USA. Portions created by F5 are Copyright (C) 1996-2002 F5
 * Inc. All Rights Reserved.  iControl (TM) is a registered trademark of F5 Netw
 *
 * Alternatively, the contents of this file may be used under the terms
 * of the GNU General Public License (the "GPL"), in which case the
 * provisions of GPL are applicable instead of those above.  If you wish
 * to allow use of your version of this file only under the terms of the
 * GPL and not to allow others to use your version of this file under the
 * License, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the GPL.
 * If you do not delete the provisions above, a recipient may use your
 * version of this file under either the License or the GPL.
 */

import java.text.*;
import java.util.*;
import java.io.*;
import org.apache.axis.*;
import org.apache.axis.components.net.*;

public class LocalLBMonitor extends Object
{
	//--------------------------------------------------------------------------
	// Member Variables
	//--------------------------------------------------------------------------
	public iControl.Interfaces m_interfaces = new iControl.Interfaces();

	//--------------------------------------------------------------------------
	// Constructor
	//--------------------------------------------------------------------------
	public LocalLBMonitor()
	{
	}

	//--------------------------------------------------------------------------
	// parseArgs
	// [0] bigip
	// [1] port
	// [2] user
	// [3] pass
	// [4] poolname
	// [5] add|remove
	// [6] memberaddr
	// [7] memberport
	//--------------------------------------------------------------------------
	public boolean parseArgs(String[] args) throws Exception
	{
		boolean bSuccess = false;
		String bigip = null;
		long port = -1;
		String user = null;
    int timeout = 1000;
		String pass = null;

		if ( args.length < 4 )
		{
			usage();
		}
		else
		{
			bigip = args[0];
			port = Integer.parseInt(args[1]);
			user = args[2];
			pass = args[3];
      
      if ( args.length >= 5 )
      {
        timeout = Integer.parseInt(args[4]);
        if ( 0 == timeout )
        {
          timeout = 1000;
        }
      }
      
			// build parameters
			m_interfaces.initialize(bigip, port, user, pass);
			
			
			getMonitorTemplateList(timeout);

			bSuccess = true;
		}

		return bSuccess;
	}

	//--------------------------------------------------------------------------
	//
	//--------------------------------------------------------------------------
	public void usage()
	{
		System.out.println("Usage: PoolMember hostname port username password [pool [add|remove memberaddr memberport]]\n");
	}
	
	public void getMonitorTemplateList(int timeout) throws Exception
	{
    
    iControl.LocalLBMonitorBindingStub _monitor = m_interfaces.getLocalLBMonitor();
    System.out.println("timeout: " + timeout);
    _monitor.setTimeout(timeout);
    org.apache.axis.AxisProperties.setProperty("axis.http.client.connection.default.so.timeout", Integer.toString(timeout));
    org.apache.axis.AxisProperties.setProperty("axis.http.client.connection.default.connection.timeout", Integer.toString(timeout));
    org.apache.axis.AxisProperties.setProperty("axis.http.client.connection.pool.timeout", Integer.toString(timeout));
    _monitor._setProperty("axis.connection.timeout", new Integer(1));
		iControl.LocalLBMonitorMonitorTemplate [] template_list = _monitor.get_template_list();
  
//		iControl.LocalLBMonitorMonitorTemplate [] template_list =
//			m_interfaces.getLocalLBMonitor().get_template_list();
		for(int i=0; i<template_list.length; i++)
		{
			String template_name = template_list[i].getTemplate_name();
			iControl.LocalLBMonitorTemplateType type = template_list[i].getTemplate_type();
			
			System.out.println(template_name + " => " + type.toString());
		}
		System.out.println("TEST");
	}



	//--------------------------------------------------------------------------
	// Main
	//--------------------------------------------------------------------------
	public static void main(String[] args)
	{
		try
		{
			LocalLBMonitor monitor = new LocalLBMonitor();
			monitor.parseArgs(args);
		}
		catch(Exception ex)
		{
			ex.printStackTrace(System.out);
		}
	}
};
