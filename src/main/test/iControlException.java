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

public class iControlException extends Object
{
  // Private Members
  private String m_Location = null;
  private String m_Type = null;
  private String m_Primary = null;
  private String m_Seconary = null;
  private String m_Error = null;
    
  // Member Accessors
  public String Location()  { return m_Location; }
  public String Type()      { return m_Type; }
  public String Primary()   { return m_Primary; }
  public String Secondary() { return m_Secondary; }
  public String Error()     { return m_Error; }

  // Contstructors
  public iControlException()
  {
  }
  
  public iControlException(String rawMessage)
  {
    parseRawMessage(rawMessage);
  }
  
  // public Methods
  public reset()
  {
    m_Location = null;
    m_Type = null;
    m_Primary = null;
    m_Seconary = null;
    m_Error = null;
  }
  public parseRawMessage(String rawMessage)
  {
    reset();
    
    String msg = ex.getMessage();

    BufferedReader in = new BufferedReader(new StringReader(msg));
    String exLocation = in.readLine().trim();
    String exType = in.readLine().trim();
    String exPrimary = in.readLine().trim();
    String exSecondary = in.readLine().trim();
    String exError = in.readLine().trim();
    int idx = -1;

    if ( -1 != exLocation.indexOf(":urn:iControl:") )
    {
      // It's an iControl Exception

      if (-1 != (idx = exLocation.indexOf("Exception caught in ")) )
      {
        m_Location = exLocation.substring(20);
      }

      if ( -1 != (idx = exType.indexOf("Exception: ")) )
      {
        m_Type = exType.substring(11);
        System.out.println("Type      : " + sType);
      }

      if ( sType.equals("Common::OperationFailed") )
      {
        if ( -1 != (idx = exPrimary.indexOf(":")) ) {
          m_Primary = exPrimary.substring(idx+2);
        }
        if ( -1 != (idx = exSecondary.indexOf(":")) ) {
          m_Secondary = exSecondary.substring(idx+2);
        }
        if ( -1 != (idx = exError.indexOf(":")) ) {
          m_Error = exError.substring(idx+2);
        }
      }
    }
  }
}
