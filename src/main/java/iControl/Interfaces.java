//===========================================================================
//
// File         : Interfaces.java
//                   
//---------------------------------------------------------------------------
//
// The contents of this file are subject to the "END USER LICENSE AGREEMENT FOR F5
// Software Development Kit for iControl"; you may not use this file except in
// compliance with the License. The License is included in the iControl
// Software Development Kit.
//
// Software distributed under the License is distributed on an "AS IS"
// basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
// the License for the specific language governing rights and limitations
// under the License.
//
// The Original Code is iControl Code and related documentation
// distributed by F5.
//
// The Initial Developer of the Original Code is F5 Networks, Inc.
// Seattle, WA, USA.
// Portions created by F5 are Copyright (C) 2006 F5 Networks, Inc.
// All Rights Reserved.
// iControl (TM) is a registered trademark of F5 Networks, Inc.
//
// Alternatively, the contents of this file may be used under the terms
// of the GNU General Public License (the "GPL"), in which case the
// provisions of GPL are applicable instead of those above.  If you wish
// to allow use of your version of this file only under the terms of the
// GPL and not to allow others to use your version of this file under the
// License, indicate your decision by deleting the provisions above and
// replace them with the notice and other provisions required by the GPL.
// If you do not delete the provisions above, a recipient may use your
// version of this file under either the License or the GPL.
//
//===========================================================================
package iControl;

import iControl.*;
import java.util.*;
import java.text.*;
import java.lang.*;

public class Interfaces extends Object
{
	//-------------------------------------------------------------------
	// Member Variables
	//-------------------------------------------------------------------

private ASMLoggingProfileBindingStub m_ASMLoggingProfile = null;
private ASMPolicyBindingStub m_ASMPolicy = null;
private ASMPolicyGroupBindingStub m_ASMPolicyGroup = null;
private ASMSystemConfigurationBindingStub m_ASMSystemConfiguration = null;
private ASMWebApplicationBindingStub m_ASMWebApplication = null;
private ASMWebApplicationGroupBindingStub m_ASMWebApplicationGroup = null;
private ClassificationApplicationBindingStub m_ClassificationApplication = null;
private ClassificationCategoryBindingStub m_ClassificationCategory = null;
private ClassificationSignatureDefinitionBindingStub m_ClassificationSignatureDefinition = null;
private ClassificationSignatureUpdateScheduleBindingStub m_ClassificationSignatureUpdateSchedule = null;
private ClassificationSignatureVersionBindingStub m_ClassificationSignatureVersion = null;
private GlobalLBApplicationBindingStub m_GlobalLBApplication = null;
private GlobalLBDataCenterBindingStub m_GlobalLBDataCenter = null;
private GlobalLBDNSSECKeyBindingStub m_GlobalLBDNSSECKey = null;
private GlobalLBDNSSECZoneBindingStub m_GlobalLBDNSSECZone = null;
private GlobalLBGlobalsBindingStub m_GlobalLBGlobals = null;
private GlobalLBLinkBindingStub m_GlobalLBLink = null;
private GlobalLBMonitorBindingStub m_GlobalLBMonitor = null;
private GlobalLBPoolBindingStub m_GlobalLBPool = null;
private GlobalLBPoolMemberBindingStub m_GlobalLBPoolMember = null;
private GlobalLBPoolV2BindingStub m_GlobalLBPoolV2 = null;
private GlobalLBProberPoolBindingStub m_GlobalLBProberPool = null;
private GlobalLBRegionBindingStub m_GlobalLBRegion = null;
private GlobalLBRuleBindingStub m_GlobalLBRule = null;
private GlobalLBServerBindingStub m_GlobalLBServer = null;
private GlobalLBTopologyBindingStub m_GlobalLBTopology = null;
private GlobalLBVirtualServerBindingStub m_GlobalLBVirtualServer = null;
private GlobalLBVirtualServerV2BindingStub m_GlobalLBVirtualServerV2 = null;
private GlobalLBWideIPBindingStub m_GlobalLBWideIP = null;
private GlobalLBWideIPV2BindingStub m_GlobalLBWideIPV2 = null;
private iCallPeriodicHandlerBindingStub m_iCallPeriodicHandler = null;
private iCallPerpetualHandlerBindingStub m_iCallPerpetualHandler = null;
private iCallScriptBindingStub m_iCallScript = null;
private iCallTriggeredHandlerBindingStub m_iCallTriggeredHandler = null;
private LocalLBALGLogProfileBindingStub m_LocalLBALGLogProfile = null;
private LocalLBClassBindingStub m_LocalLBClass = null;
private LocalLBContentPolicyBindingStub m_LocalLBContentPolicy = null;
private LocalLBContentPolicyStrategyBindingStub m_LocalLBContentPolicyStrategy = null;
private LocalLBDataGroupFileBindingStub m_LocalLBDataGroupFile = null;
private LocalLBDNSCacheBindingStub m_LocalLBDNSCache = null;
private LocalLBDNSExpressBindingStub m_LocalLBDNSExpress = null;
private LocalLBDNSGlobalsBindingStub m_LocalLBDNSGlobals = null;
private LocalLBDNSServerBindingStub m_LocalLBDNSServer = null;
private LocalLBDNSTSIGKeyBindingStub m_LocalLBDNSTSIGKey = null;
private LocalLBDNSZoneBindingStub m_LocalLBDNSZone = null;
private LocalLBFlowEvictionPolicyBindingStub m_LocalLBFlowEvictionPolicy = null;
private LocalLBiFileBindingStub m_LocalLBiFile = null;
private LocalLBiFileFileBindingStub m_LocalLBiFileFile = null;
private LocalLBLSNLogProfileBindingStub m_LocalLBLSNLogProfile = null;
private LocalLBLSNPoolBindingStub m_LocalLBLSNPool = null;
private LocalLBMessageRoutingPeerBindingStub m_LocalLBMessageRoutingPeer = null;
private LocalLBMessageRoutingSIPRouteBindingStub m_LocalLBMessageRoutingSIPRoute = null;
private LocalLBMessageRoutingTransportConfigBindingStub m_LocalLBMessageRoutingTransportConfig = null;
private LocalLBMonitorBindingStub m_LocalLBMonitor = null;
private LocalLBNATBindingStub m_LocalLBNAT = null;
private LocalLBNATV2BindingStub m_LocalLBNATV2 = null;
private LocalLBNodeAddressBindingStub m_LocalLBNodeAddress = null;
private LocalLBNodeAddressV2BindingStub m_LocalLBNodeAddressV2 = null;
private LocalLBOCSPStaplingParametersBindingStub m_LocalLBOCSPStaplingParameters = null;
private LocalLBPoolBindingStub m_LocalLBPool = null;
private LocalLBPoolMemberBindingStub m_LocalLBPoolMember = null;
private LocalLBProfileAnalyticsBindingStub m_LocalLBProfileAnalytics = null;
private LocalLBProfileAuthBindingStub m_LocalLBProfileAuth = null;
private LocalLBProfileClassificationBindingStub m_LocalLBProfileClassification = null;
private LocalLBProfileClientLDAPBindingStub m_LocalLBProfileClientLDAP = null;
private LocalLBProfileClientSSLBindingStub m_LocalLBProfileClientSSL = null;
private LocalLBProfileDiameterBindingStub m_LocalLBProfileDiameter = null;
private LocalLBProfileDiameterEndpointBindingStub m_LocalLBProfileDiameterEndpoint = null;
private LocalLBProfileDNSBindingStub m_LocalLBProfileDNS = null;
private LocalLBProfileDNSLoggingBindingStub m_LocalLBProfileDNSLogging = null;
private LocalLBProfileFastHttpBindingStub m_LocalLBProfileFastHttp = null;
private LocalLBProfileFastL4BindingStub m_LocalLBProfileFastL4 = null;
private LocalLBProfileFIXBindingStub m_LocalLBProfileFIX = null;
private LocalLBProfileFTPBindingStub m_LocalLBProfileFTP = null;
private LocalLBProfileHttpBindingStub m_LocalLBProfileHttp = null;
private LocalLBProfileHttpClassBindingStub m_LocalLBProfileHttpClass = null;
private LocalLBProfileHttpCompressionBindingStub m_LocalLBProfileHttpCompression = null;
private LocalLBProfileICAPBindingStub m_LocalLBProfileICAP = null;
private LocalLBProfileIIOPBindingStub m_LocalLBProfileIIOP = null;
private LocalLBProfileOneConnectBindingStub m_LocalLBProfileOneConnect = null;
private LocalLBProfilePCPBindingStub m_LocalLBProfilePCP = null;
private LocalLBProfilePersistenceBindingStub m_LocalLBProfilePersistence = null;
private LocalLBProfilePPTPBindingStub m_LocalLBProfilePPTP = null;
private LocalLBProfileRADIUSBindingStub m_LocalLBProfileRADIUS = null;
private LocalLBProfileRequestAdaptBindingStub m_LocalLBProfileRequestAdapt = null;
private LocalLBProfileRequestLoggingBindingStub m_LocalLBProfileRequestLogging = null;
private LocalLBProfileResponseAdaptBindingStub m_LocalLBProfileResponseAdapt = null;
private LocalLBProfileRTSPBindingStub m_LocalLBProfileRTSP = null;
private LocalLBProfileSCTPBindingStub m_LocalLBProfileSCTP = null;
private LocalLBProfileServerLDAPBindingStub m_LocalLBProfileServerLDAP = null;
private LocalLBProfileServerSSLBindingStub m_LocalLBProfileServerSSL = null;
private LocalLBProfileSIPBindingStub m_LocalLBProfileSIP = null;
private LocalLBProfileSIPRouterBindingStub m_LocalLBProfileSIPRouter = null;
private LocalLBProfileSIPSessionBindingStub m_LocalLBProfileSIPSession = null;
private LocalLBProfileSMTPSBindingStub m_LocalLBProfileSMTPS = null;
private LocalLBProfileSPDYBindingStub m_LocalLBProfileSPDY = null;
private LocalLBProfileSPMBindingStub m_LocalLBProfileSPM = null;
private LocalLBProfileStreamBindingStub m_LocalLBProfileStream = null;
private LocalLBProfileTCPBindingStub m_LocalLBProfileTCP = null;
private LocalLBProfileTCPAnalyticsBindingStub m_LocalLBProfileTCPAnalytics = null;
private LocalLBProfileTFTPBindingStub m_LocalLBProfileTFTP = null;
private LocalLBProfileUDPBindingStub m_LocalLBProfileUDP = null;
private LocalLBProfileUserStatisticBindingStub m_LocalLBProfileUserStatistic = null;
private LocalLBProfileWebAccelerationBindingStub m_LocalLBProfileWebAcceleration = null;
private LocalLBProfileXMLBindingStub m_LocalLBProfileXML = null;
private LocalLBRAMCacheInformationBindingStub m_LocalLBRAMCacheInformation = null;
private LocalLBRateClassBindingStub m_LocalLBRateClass = null;
private LocalLBRuleBindingStub m_LocalLBRule = null;
private LocalLBSNATBindingStub m_LocalLBSNAT = null;
private LocalLBSNATPoolBindingStub m_LocalLBSNATPool = null;
private LocalLBSNATPoolMemberBindingStub m_LocalLBSNATPoolMember = null;
private LocalLBSNATTranslationAddressBindingStub m_LocalLBSNATTranslationAddress = null;
private LocalLBSNATTranslationAddressV2BindingStub m_LocalLBSNATTranslationAddressV2 = null;
private LocalLBVirtualAddressBindingStub m_LocalLBVirtualAddress = null;
private LocalLBVirtualAddressV2BindingStub m_LocalLBVirtualAddressV2 = null;
private LocalLBVirtualServerBindingStub m_LocalLBVirtualServer = null;
private LogDestinationArcSightBindingStub m_LogDestinationArcSight = null;
private LogDestinationIPFIXBindingStub m_LogDestinationIPFIX = null;
private LogDestinationLocalSyslogBindingStub m_LogDestinationLocalSyslog = null;
private LogDestinationManagementPortBindingStub m_LogDestinationManagementPort = null;
private LogDestinationRemoteHighSpeedLogBindingStub m_LogDestinationRemoteHighSpeedLog = null;
private LogDestinationRemoteSyslogBindingStub m_LogDestinationRemoteSyslog = null;
private LogDestinationSplunkBindingStub m_LogDestinationSplunk = null;
private LogFilterBindingStub m_LogFilter = null;
private LogIPFIXInformationElementBindingStub m_LogIPFIXInformationElement = null;
private LogPublisherBindingStub m_LogPublisher = null;
private LTConfigClassBindingStub m_LTConfigClass = null;
private LTConfigFieldBindingStub m_LTConfigField = null;
private ManagementApplicationPresentationScriptBindingStub m_ManagementApplicationPresentationScript = null;
private ManagementApplicationServiceBindingStub m_ManagementApplicationService = null;
private ManagementApplicationTemplateBindingStub m_ManagementApplicationTemplate = null;
private ManagementCCLDAPConfigurationBindingStub m_ManagementCCLDAPConfiguration = null;
private ManagementCertLDAPConfigurationBindingStub m_ManagementCertLDAPConfiguration = null;
private ManagementCLIScriptBindingStub m_ManagementCLIScript = null;
private ManagementCRLDPConfigurationBindingStub m_ManagementCRLDPConfiguration = null;
private ManagementCRLDPServerBindingStub m_ManagementCRLDPServer = null;
private ManagementDBVariableBindingStub m_ManagementDBVariable = null;
private ManagementDeviceBindingStub m_ManagementDevice = null;
private ManagementDeviceGroupBindingStub m_ManagementDeviceGroup = null;
private ManagementEMBindingStub m_ManagementEM = null;
private ManagementEventNotificationBindingStub m_ManagementEventNotification = null;
private ManagementEventSubscriptionBindingStub m_ManagementEventSubscription = null;
private ManagementFeatureModuleBindingStub m_ManagementFeatureModule = null;
private ManagementFolderBindingStub m_ManagementFolder = null;
private ManagementGlobalsBindingStub m_ManagementGlobals = null;
private ManagementKeyCertificateBindingStub m_ManagementKeyCertificate = null;
private ManagementLDAPConfigurationBindingStub m_ManagementLDAPConfiguration = null;
private ManagementLicenseAdministrationBindingStub m_ManagementLicenseAdministration = null;
private ManagementNamedBindingStub m_ManagementNamed = null;
private ManagementOCSPConfigurationBindingStub m_ManagementOCSPConfiguration = null;
private ManagementOCSPResponderBindingStub m_ManagementOCSPResponder = null;
private ManagementPartitionBindingStub m_ManagementPartition = null;
private ManagementProvisionBindingStub m_ManagementProvision = null;
private ManagementRADIUSConfigurationBindingStub m_ManagementRADIUSConfiguration = null;
private ManagementRADIUSServerBindingStub m_ManagementRADIUSServer = null;
private ManagementResourceRecordBindingStub m_ManagementResourceRecord = null;
private ManagementSFlowDataSourceBindingStub m_ManagementSFlowDataSource = null;
private ManagementSFlowGlobalsBindingStub m_ManagementSFlowGlobals = null;
private ManagementSFlowReceiverBindingStub m_ManagementSFlowReceiver = null;
private ManagementSMTPConfigurationBindingStub m_ManagementSMTPConfiguration = null;
private ManagementSNMPConfigurationBindingStub m_ManagementSNMPConfiguration = null;
private ManagementTACACSConfigurationBindingStub m_ManagementTACACSConfiguration = null;
private ManagementTMOSModuleBindingStub m_ManagementTMOSModule = null;
private ManagementTrafficGroupBindingStub m_ManagementTrafficGroup = null;
private ManagementTrustBindingStub m_ManagementTrust = null;
private ManagementUserManagementBindingStub m_ManagementUserManagement = null;
private ManagementViewBindingStub m_ManagementView = null;
private ManagementZoneBindingStub m_ManagementZone = null;
private ManagementZoneRunnerBindingStub m_ManagementZoneRunner = null;
private NetworkingAdminIPBindingStub m_NetworkingAdminIP = null;
private NetworkingARPBindingStub m_NetworkingARP = null;
private NetworkingBWControllerPolicyBindingStub m_NetworkingBWControllerPolicy = null;
private NetworkingBWPriorityGroupBindingStub m_NetworkingBWPriorityGroup = null;
private NetworkingDNSResolverBindingStub m_NetworkingDNSResolver = null;
private NetworkingInterfacesBindingStub m_NetworkingInterfaces = null;
private NetworkingIPsecIkeDaemonBindingStub m_NetworkingIPsecIkeDaemon = null;
private NetworkingIPsecIkePeerBindingStub m_NetworkingIPsecIkePeer = null;
private NetworkingIPsecManualSecurityAssociationBindingStub m_NetworkingIPsecManualSecurityAssociation = null;
private NetworkingIPsecPolicyBindingStub m_NetworkingIPsecPolicy = null;
private NetworkingIPsecTrafficSelectorBindingStub m_NetworkingIPsecTrafficSelector = null;
private NetworkingiSessionAdvertisedRouteBindingStub m_NetworkingiSessionAdvertisedRoute = null;
private NetworkingiSessionAdvertisedRouteV2BindingStub m_NetworkingiSessionAdvertisedRouteV2 = null;
private NetworkingiSessionDatastorBindingStub m_NetworkingiSessionDatastor = null;
private NetworkingiSessionDeduplicationBindingStub m_NetworkingiSessionDeduplication = null;
private NetworkingiSessionLocalInterfaceBindingStub m_NetworkingiSessionLocalInterface = null;
private NetworkingiSessionPeerDiscoveryBindingStub m_NetworkingiSessionPeerDiscovery = null;
private NetworkingiSessionRemoteInterfaceBindingStub m_NetworkingiSessionRemoteInterface = null;
private NetworkingiSessionRemoteInterfaceV2BindingStub m_NetworkingiSessionRemoteInterfaceV2 = null;
private NetworkingLLDPGlobalsBindingStub m_NetworkingLLDPGlobals = null;
private NetworkingMulticastRouteBindingStub m_NetworkingMulticastRoute = null;
private NetworkingPacketFilterBindingStub m_NetworkingPacketFilter = null;
private NetworkingPacketFilterGlobalsBindingStub m_NetworkingPacketFilterGlobals = null;
private NetworkingPortMirrorBindingStub m_NetworkingPortMirror = null;
private NetworkingProfileFECBindingStub m_NetworkingProfileFEC = null;
private NetworkingProfileGeneveBindingStub m_NetworkingProfileGeneve = null;
private NetworkingProfileGREBindingStub m_NetworkingProfileGRE = null;
private NetworkingProfileIPIPBindingStub m_NetworkingProfileIPIP = null;
private NetworkingProfileIPsecBindingStub m_NetworkingProfileIPsec = null;
private NetworkingProfileLightweight4Over6TunnelBindingStub m_NetworkingProfileLightweight4Over6Tunnel = null;
private NetworkingProfileMAPBindingStub m_NetworkingProfileMAP = null;
private NetworkingProfileV6RDBindingStub m_NetworkingProfileV6RD = null;
private NetworkingProfileVXLANBindingStub m_NetworkingProfileVXLAN = null;
private NetworkingProfileWCCPGREBindingStub m_NetworkingProfileWCCPGRE = null;
private NetworkingRouteDomainBindingStub m_NetworkingRouteDomain = null;
private NetworkingRouteDomainV2BindingStub m_NetworkingRouteDomainV2 = null;
private NetworkingRouterAdvertisementBindingStub m_NetworkingRouterAdvertisement = null;
private NetworkingRouteTableBindingStub m_NetworkingRouteTable = null;
private NetworkingRouteTableV2BindingStub m_NetworkingRouteTableV2 = null;
private NetworkingSelfIPBindingStub m_NetworkingSelfIP = null;
private NetworkingSelfIPPortLockdownBindingStub m_NetworkingSelfIPPortLockdown = null;
private NetworkingSelfIPV2BindingStub m_NetworkingSelfIPV2 = null;
private NetworkingSTPGlobalsBindingStub m_NetworkingSTPGlobals = null;
private NetworkingSTPInstanceBindingStub m_NetworkingSTPInstance = null;
private NetworkingSTPInstanceV2BindingStub m_NetworkingSTPInstanceV2 = null;
private NetworkingTrunkBindingStub m_NetworkingTrunk = null;
private NetworkingTunnelBindingStub m_NetworkingTunnel = null;
private NetworkingVLANBindingStub m_NetworkingVLAN = null;
private NetworkingVLANGroupBindingStub m_NetworkingVLANGroup = null;
private PEMFormatScriptBindingStub m_PEMFormatScript = null;
private PEMForwardingEndpointBindingStub m_PEMForwardingEndpoint = null;
private PEMInterceptionEndpointBindingStub m_PEMInterceptionEndpoint = null;
private PEMListenerBindingStub m_PEMListener = null;
private PEMPolicyBindingStub m_PEMPolicy = null;
private PEMServiceChainEndpointBindingStub m_PEMServiceChainEndpoint = null;
private PEMSubscriberBindingStub m_PEMSubscriber = null;
private SecurityDoSDeviceBindingStub m_SecurityDoSDevice = null;
private SecurityDoSWhitelistBindingStub m_SecurityDoSWhitelist = null;
private SecurityFirewallAddressListBindingStub m_SecurityFirewallAddressList = null;
private SecurityFirewallGlobalAdminIPRuleListBindingStub m_SecurityFirewallGlobalAdminIPRuleList = null;
private SecurityFirewallGlobalRuleListBindingStub m_SecurityFirewallGlobalRuleList = null;
private SecurityFirewallPolicyBindingStub m_SecurityFirewallPolicy = null;
private SecurityFirewallPortListBindingStub m_SecurityFirewallPortList = null;
private SecurityFirewallRuleListBindingStub m_SecurityFirewallRuleList = null;
private SecurityFirewallWeeklyScheduleBindingStub m_SecurityFirewallWeeklySchedule = null;
private SecurityIPIntelligenceBlacklistCategoryBindingStub m_SecurityIPIntelligenceBlacklistCategory = null;
private SecurityIPIntelligenceFeedListBindingStub m_SecurityIPIntelligenceFeedList = null;
private SecurityIPIntelligenceGlobalPolicyBindingStub m_SecurityIPIntelligenceGlobalPolicy = null;
private SecurityIPIntelligencePolicyBindingStub m_SecurityIPIntelligencePolicy = null;
private SecurityLogProfileBindingStub m_SecurityLogProfile = null;
private SecurityProfileDNSSecurityBindingStub m_SecurityProfileDNSSecurity = null;
private SecurityProfileDoSBindingStub m_SecurityProfileDoS = null;
private SecurityProfileIPIntelligenceBindingStub m_SecurityProfileIPIntelligence = null;
private SystemCertificateRevocationListFileBindingStub m_SystemCertificateRevocationListFile = null;
private SystemClusterBindingStub m_SystemCluster = null;
private SystemConfigSyncBindingStub m_SystemConfigSync = null;
private SystemCryptoClientBindingStub m_SystemCryptoClient = null;
private SystemCryptoServerBindingStub m_SystemCryptoServer = null;
private SystemDiskBindingStub m_SystemDisk = null;
private SystemExternalMonitorFileBindingStub m_SystemExternalMonitorFile = null;
private SystemFailoverBindingStub m_SystemFailover = null;
private SystemGeoIPBindingStub m_SystemGeoIP = null;
private SystemHAGroupBindingStub m_SystemHAGroup = null;
private SystemHAStatusBindingStub m_SystemHAStatus = null;
private SystemInetBindingStub m_SystemInet = null;
private SystemLightweightTunnelTableFileBindingStub m_SystemLightweightTunnelTableFile = null;
private SystemPerformanceSFlowBindingStub m_SystemPerformanceSFlow = null;
private SystemServicesBindingStub m_SystemServices = null;
private SystemSessionBindingStub m_SystemSession = null;
private SystemSoftwareManagementBindingStub m_SystemSoftwareManagement = null;
private SystemStatisticsBindingStub m_SystemStatistics = null;
private SystemSystemInfoBindingStub m_SystemSystemInfo = null;
private SystemVCMPBindingStub m_SystemVCMP = null;
private WebAcceleratorApplicationsBindingStub m_WebAcceleratorApplications = null;
private WebAcceleratorPoliciesBindingStub m_WebAcceleratorPolicies = null;

  
	private Boolean m_bInitialized = false;
	private int m_timeout = 60000;
	private String m_hostname = "";
	private long m_port = 443;
	private String m_username = "";
	private String m_password = "";

	private void setupInterface(org.apache.axis.client.Stub stub)
	{
		stub.setTimeout(m_timeout); stub.setUsername(m_username); stub.setPassword(m_password); 
	}
	
	//-------------------------------------------------------------------
	// public member accessors
	//-------------------------------------------------------------------
public ASMLoggingProfileBindingStub getASMLoggingProfile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMLoggingProfile ) { m_ASMLoggingProfile = (iControl.ASMLoggingProfileBindingStub) new iControl.ASMLoggingProfileLocator().getASMLoggingProfilePort(new java.net.URL(buildURL())); } setupInterface(m_ASMLoggingProfile); return m_ASMLoggingProfile;}
public ASMPolicyBindingStub getASMPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMPolicy ) { m_ASMPolicy = (iControl.ASMPolicyBindingStub) new iControl.ASMPolicyLocator().getASMPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_ASMPolicy); return m_ASMPolicy;}
public ASMPolicyGroupBindingStub getASMPolicyGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMPolicyGroup ) { m_ASMPolicyGroup = (iControl.ASMPolicyGroupBindingStub) new iControl.ASMPolicyGroupLocator().getASMPolicyGroupPort(new java.net.URL(buildURL())); } setupInterface(m_ASMPolicyGroup); return m_ASMPolicyGroup;}
public ASMSystemConfigurationBindingStub getASMSystemConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMSystemConfiguration ) { m_ASMSystemConfiguration = (iControl.ASMSystemConfigurationBindingStub) new iControl.ASMSystemConfigurationLocator().getASMSystemConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ASMSystemConfiguration); return m_ASMSystemConfiguration;}
public ASMWebApplicationBindingStub getASMWebApplication() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMWebApplication ) { m_ASMWebApplication = (iControl.ASMWebApplicationBindingStub) new iControl.ASMWebApplicationLocator().getASMWebApplicationPort(new java.net.URL(buildURL())); } setupInterface(m_ASMWebApplication); return m_ASMWebApplication;}
public ASMWebApplicationGroupBindingStub getASMWebApplicationGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ASMWebApplicationGroup ) { m_ASMWebApplicationGroup = (iControl.ASMWebApplicationGroupBindingStub) new iControl.ASMWebApplicationGroupLocator().getASMWebApplicationGroupPort(new java.net.URL(buildURL())); } setupInterface(m_ASMWebApplicationGroup); return m_ASMWebApplicationGroup;}
public ClassificationApplicationBindingStub getClassificationApplication() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ClassificationApplication ) { m_ClassificationApplication = (iControl.ClassificationApplicationBindingStub) new iControl.ClassificationApplicationLocator().getClassificationApplicationPort(new java.net.URL(buildURL())); } setupInterface(m_ClassificationApplication); return m_ClassificationApplication;}
public ClassificationCategoryBindingStub getClassificationCategory() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ClassificationCategory ) { m_ClassificationCategory = (iControl.ClassificationCategoryBindingStub) new iControl.ClassificationCategoryLocator().getClassificationCategoryPort(new java.net.URL(buildURL())); } setupInterface(m_ClassificationCategory); return m_ClassificationCategory;}
public ClassificationSignatureDefinitionBindingStub getClassificationSignatureDefinition() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ClassificationSignatureDefinition ) { m_ClassificationSignatureDefinition = (iControl.ClassificationSignatureDefinitionBindingStub) new iControl.ClassificationSignatureDefinitionLocator().getClassificationSignatureDefinitionPort(new java.net.URL(buildURL())); } setupInterface(m_ClassificationSignatureDefinition); return m_ClassificationSignatureDefinition;}
public ClassificationSignatureUpdateScheduleBindingStub getClassificationSignatureUpdateSchedule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ClassificationSignatureUpdateSchedule ) { m_ClassificationSignatureUpdateSchedule = (iControl.ClassificationSignatureUpdateScheduleBindingStub) new iControl.ClassificationSignatureUpdateScheduleLocator().getClassificationSignatureUpdateSchedulePort(new java.net.URL(buildURL())); } setupInterface(m_ClassificationSignatureUpdateSchedule); return m_ClassificationSignatureUpdateSchedule;}
public ClassificationSignatureVersionBindingStub getClassificationSignatureVersion() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ClassificationSignatureVersion ) { m_ClassificationSignatureVersion = (iControl.ClassificationSignatureVersionBindingStub) new iControl.ClassificationSignatureVersionLocator().getClassificationSignatureVersionPort(new java.net.URL(buildURL())); } setupInterface(m_ClassificationSignatureVersion); return m_ClassificationSignatureVersion;}
public GlobalLBApplicationBindingStub getGlobalLBApplication() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBApplication ) { m_GlobalLBApplication = (iControl.GlobalLBApplicationBindingStub) new iControl.GlobalLBApplicationLocator().getGlobalLBApplicationPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBApplication); return m_GlobalLBApplication;}
public GlobalLBDataCenterBindingStub getGlobalLBDataCenter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBDataCenter ) { m_GlobalLBDataCenter = (iControl.GlobalLBDataCenterBindingStub) new iControl.GlobalLBDataCenterLocator().getGlobalLBDataCenterPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBDataCenter); return m_GlobalLBDataCenter;}
public GlobalLBDNSSECKeyBindingStub getGlobalLBDNSSECKey() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBDNSSECKey ) { m_GlobalLBDNSSECKey = (iControl.GlobalLBDNSSECKeyBindingStub) new iControl.GlobalLBDNSSECKeyLocator().getGlobalLBDNSSECKeyPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBDNSSECKey); return m_GlobalLBDNSSECKey;}
public GlobalLBDNSSECZoneBindingStub getGlobalLBDNSSECZone() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBDNSSECZone ) { m_GlobalLBDNSSECZone = (iControl.GlobalLBDNSSECZoneBindingStub) new iControl.GlobalLBDNSSECZoneLocator().getGlobalLBDNSSECZonePort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBDNSSECZone); return m_GlobalLBDNSSECZone;}
public GlobalLBGlobalsBindingStub getGlobalLBGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBGlobals ) { m_GlobalLBGlobals = (iControl.GlobalLBGlobalsBindingStub) new iControl.GlobalLBGlobalsLocator().getGlobalLBGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBGlobals); return m_GlobalLBGlobals;}
public GlobalLBLinkBindingStub getGlobalLBLink() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBLink ) { m_GlobalLBLink = (iControl.GlobalLBLinkBindingStub) new iControl.GlobalLBLinkLocator().getGlobalLBLinkPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBLink); return m_GlobalLBLink;}
public GlobalLBMonitorBindingStub getGlobalLBMonitor() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBMonitor ) { m_GlobalLBMonitor = (iControl.GlobalLBMonitorBindingStub) new iControl.GlobalLBMonitorLocator().getGlobalLBMonitorPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBMonitor); return m_GlobalLBMonitor;}
public GlobalLBPoolBindingStub getGlobalLBPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBPool ) { m_GlobalLBPool = (iControl.GlobalLBPoolBindingStub) new iControl.GlobalLBPoolLocator().getGlobalLBPoolPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBPool); return m_GlobalLBPool;}
public GlobalLBPoolMemberBindingStub getGlobalLBPoolMember() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBPoolMember ) { m_GlobalLBPoolMember = (iControl.GlobalLBPoolMemberBindingStub) new iControl.GlobalLBPoolMemberLocator().getGlobalLBPoolMemberPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBPoolMember); return m_GlobalLBPoolMember;}
public GlobalLBPoolV2BindingStub getGlobalLBPoolV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBPoolV2 ) { m_GlobalLBPoolV2 = (iControl.GlobalLBPoolV2BindingStub) new iControl.GlobalLBPoolV2Locator().getGlobalLBPoolV2Port(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBPoolV2); return m_GlobalLBPoolV2;}
public GlobalLBProberPoolBindingStub getGlobalLBProberPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBProberPool ) { m_GlobalLBProberPool = (iControl.GlobalLBProberPoolBindingStub) new iControl.GlobalLBProberPoolLocator().getGlobalLBProberPoolPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBProberPool); return m_GlobalLBProberPool;}
public GlobalLBRegionBindingStub getGlobalLBRegion() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBRegion ) { m_GlobalLBRegion = (iControl.GlobalLBRegionBindingStub) new iControl.GlobalLBRegionLocator().getGlobalLBRegionPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBRegion); return m_GlobalLBRegion;}
public GlobalLBRuleBindingStub getGlobalLBRule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBRule ) { m_GlobalLBRule = (iControl.GlobalLBRuleBindingStub) new iControl.GlobalLBRuleLocator().getGlobalLBRulePort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBRule); return m_GlobalLBRule;}
public GlobalLBServerBindingStub getGlobalLBServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBServer ) { m_GlobalLBServer = (iControl.GlobalLBServerBindingStub) new iControl.GlobalLBServerLocator().getGlobalLBServerPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBServer); return m_GlobalLBServer;}
public GlobalLBTopologyBindingStub getGlobalLBTopology() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBTopology ) { m_GlobalLBTopology = (iControl.GlobalLBTopologyBindingStub) new iControl.GlobalLBTopologyLocator().getGlobalLBTopologyPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBTopology); return m_GlobalLBTopology;}
public GlobalLBVirtualServerBindingStub getGlobalLBVirtualServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBVirtualServer ) { m_GlobalLBVirtualServer = (iControl.GlobalLBVirtualServerBindingStub) new iControl.GlobalLBVirtualServerLocator().getGlobalLBVirtualServerPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBVirtualServer); return m_GlobalLBVirtualServer;}
public GlobalLBVirtualServerV2BindingStub getGlobalLBVirtualServerV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBVirtualServerV2 ) { m_GlobalLBVirtualServerV2 = (iControl.GlobalLBVirtualServerV2BindingStub) new iControl.GlobalLBVirtualServerV2Locator().getGlobalLBVirtualServerV2Port(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBVirtualServerV2); return m_GlobalLBVirtualServerV2;}
public GlobalLBWideIPBindingStub getGlobalLBWideIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBWideIP ) { m_GlobalLBWideIP = (iControl.GlobalLBWideIPBindingStub) new iControl.GlobalLBWideIPLocator().getGlobalLBWideIPPort(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBWideIP); return m_GlobalLBWideIP;}
public GlobalLBWideIPV2BindingStub getGlobalLBWideIPV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_GlobalLBWideIPV2 ) { m_GlobalLBWideIPV2 = (iControl.GlobalLBWideIPV2BindingStub) new iControl.GlobalLBWideIPV2Locator().getGlobalLBWideIPV2Port(new java.net.URL(buildURL())); } setupInterface(m_GlobalLBWideIPV2); return m_GlobalLBWideIPV2;}
public iCallPeriodicHandlerBindingStub getiCallPeriodicHandler() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_iCallPeriodicHandler ) { m_iCallPeriodicHandler = (iControl.iCallPeriodicHandlerBindingStub) new iControl.iCallPeriodicHandlerLocator().getiCallPeriodicHandlerPort(new java.net.URL(buildURL())); } setupInterface(m_iCallPeriodicHandler); return m_iCallPeriodicHandler;}
public iCallPerpetualHandlerBindingStub getiCallPerpetualHandler() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_iCallPerpetualHandler ) { m_iCallPerpetualHandler = (iControl.iCallPerpetualHandlerBindingStub) new iControl.iCallPerpetualHandlerLocator().getiCallPerpetualHandlerPort(new java.net.URL(buildURL())); } setupInterface(m_iCallPerpetualHandler); return m_iCallPerpetualHandler;}
public iCallScriptBindingStub getiCallScript() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_iCallScript ) { m_iCallScript = (iControl.iCallScriptBindingStub) new iControl.iCallScriptLocator().getiCallScriptPort(new java.net.URL(buildURL())); } setupInterface(m_iCallScript); return m_iCallScript;}
public iCallTriggeredHandlerBindingStub getiCallTriggeredHandler() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_iCallTriggeredHandler ) { m_iCallTriggeredHandler = (iControl.iCallTriggeredHandlerBindingStub) new iControl.iCallTriggeredHandlerLocator().getiCallTriggeredHandlerPort(new java.net.URL(buildURL())); } setupInterface(m_iCallTriggeredHandler); return m_iCallTriggeredHandler;}
public LocalLBALGLogProfileBindingStub getLocalLBALGLogProfile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBALGLogProfile ) { m_LocalLBALGLogProfile = (iControl.LocalLBALGLogProfileBindingStub) new iControl.LocalLBALGLogProfileLocator().getLocalLBALGLogProfilePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBALGLogProfile); return m_LocalLBALGLogProfile;}
public LocalLBClassBindingStub getLocalLBClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBClass ) { m_LocalLBClass = (iControl.LocalLBClassBindingStub) new iControl.LocalLBClassLocator().getLocalLBClassPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBClass); return m_LocalLBClass;}
public LocalLBContentPolicyBindingStub getLocalLBContentPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBContentPolicy ) { m_LocalLBContentPolicy = (iControl.LocalLBContentPolicyBindingStub) new iControl.LocalLBContentPolicyLocator().getLocalLBContentPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBContentPolicy); return m_LocalLBContentPolicy;}
public LocalLBContentPolicyStrategyBindingStub getLocalLBContentPolicyStrategy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBContentPolicyStrategy ) { m_LocalLBContentPolicyStrategy = (iControl.LocalLBContentPolicyStrategyBindingStub) new iControl.LocalLBContentPolicyStrategyLocator().getLocalLBContentPolicyStrategyPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBContentPolicyStrategy); return m_LocalLBContentPolicyStrategy;}
public LocalLBDataGroupFileBindingStub getLocalLBDataGroupFile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDataGroupFile ) { m_LocalLBDataGroupFile = (iControl.LocalLBDataGroupFileBindingStub) new iControl.LocalLBDataGroupFileLocator().getLocalLBDataGroupFilePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDataGroupFile); return m_LocalLBDataGroupFile;}
public LocalLBDNSCacheBindingStub getLocalLBDNSCache() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDNSCache ) { m_LocalLBDNSCache = (iControl.LocalLBDNSCacheBindingStub) new iControl.LocalLBDNSCacheLocator().getLocalLBDNSCachePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDNSCache); return m_LocalLBDNSCache;}
public LocalLBDNSExpressBindingStub getLocalLBDNSExpress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDNSExpress ) { m_LocalLBDNSExpress = (iControl.LocalLBDNSExpressBindingStub) new iControl.LocalLBDNSExpressLocator().getLocalLBDNSExpressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDNSExpress); return m_LocalLBDNSExpress;}
public LocalLBDNSGlobalsBindingStub getLocalLBDNSGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDNSGlobals ) { m_LocalLBDNSGlobals = (iControl.LocalLBDNSGlobalsBindingStub) new iControl.LocalLBDNSGlobalsLocator().getLocalLBDNSGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDNSGlobals); return m_LocalLBDNSGlobals;}
public LocalLBDNSServerBindingStub getLocalLBDNSServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDNSServer ) { m_LocalLBDNSServer = (iControl.LocalLBDNSServerBindingStub) new iControl.LocalLBDNSServerLocator().getLocalLBDNSServerPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDNSServer); return m_LocalLBDNSServer;}
public LocalLBDNSTSIGKeyBindingStub getLocalLBDNSTSIGKey() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDNSTSIGKey ) { m_LocalLBDNSTSIGKey = (iControl.LocalLBDNSTSIGKeyBindingStub) new iControl.LocalLBDNSTSIGKeyLocator().getLocalLBDNSTSIGKeyPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDNSTSIGKey); return m_LocalLBDNSTSIGKey;}
public LocalLBDNSZoneBindingStub getLocalLBDNSZone() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBDNSZone ) { m_LocalLBDNSZone = (iControl.LocalLBDNSZoneBindingStub) new iControl.LocalLBDNSZoneLocator().getLocalLBDNSZonePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBDNSZone); return m_LocalLBDNSZone;}
public LocalLBFlowEvictionPolicyBindingStub getLocalLBFlowEvictionPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBFlowEvictionPolicy ) { m_LocalLBFlowEvictionPolicy = (iControl.LocalLBFlowEvictionPolicyBindingStub) new iControl.LocalLBFlowEvictionPolicyLocator().getLocalLBFlowEvictionPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBFlowEvictionPolicy); return m_LocalLBFlowEvictionPolicy;}
public LocalLBiFileBindingStub getLocalLBiFile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBiFile ) { m_LocalLBiFile = (iControl.LocalLBiFileBindingStub) new iControl.LocalLBiFileLocator().getLocalLBiFilePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBiFile); return m_LocalLBiFile;}
public LocalLBiFileFileBindingStub getLocalLBiFileFile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBiFileFile ) { m_LocalLBiFileFile = (iControl.LocalLBiFileFileBindingStub) new iControl.LocalLBiFileFileLocator().getLocalLBiFileFilePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBiFileFile); return m_LocalLBiFileFile;}
public LocalLBLSNLogProfileBindingStub getLocalLBLSNLogProfile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBLSNLogProfile ) { m_LocalLBLSNLogProfile = (iControl.LocalLBLSNLogProfileBindingStub) new iControl.LocalLBLSNLogProfileLocator().getLocalLBLSNLogProfilePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBLSNLogProfile); return m_LocalLBLSNLogProfile;}
public LocalLBLSNPoolBindingStub getLocalLBLSNPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBLSNPool ) { m_LocalLBLSNPool = (iControl.LocalLBLSNPoolBindingStub) new iControl.LocalLBLSNPoolLocator().getLocalLBLSNPoolPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBLSNPool); return m_LocalLBLSNPool;}
public LocalLBMessageRoutingPeerBindingStub getLocalLBMessageRoutingPeer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBMessageRoutingPeer ) { m_LocalLBMessageRoutingPeer = (iControl.LocalLBMessageRoutingPeerBindingStub) new iControl.LocalLBMessageRoutingPeerLocator().getLocalLBMessageRoutingPeerPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBMessageRoutingPeer); return m_LocalLBMessageRoutingPeer;}
public LocalLBMessageRoutingSIPRouteBindingStub getLocalLBMessageRoutingSIPRoute() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBMessageRoutingSIPRoute ) { m_LocalLBMessageRoutingSIPRoute = (iControl.LocalLBMessageRoutingSIPRouteBindingStub) new iControl.LocalLBMessageRoutingSIPRouteLocator().getLocalLBMessageRoutingSIPRoutePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBMessageRoutingSIPRoute); return m_LocalLBMessageRoutingSIPRoute;}
public LocalLBMessageRoutingTransportConfigBindingStub getLocalLBMessageRoutingTransportConfig() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBMessageRoutingTransportConfig ) { m_LocalLBMessageRoutingTransportConfig = (iControl.LocalLBMessageRoutingTransportConfigBindingStub) new iControl.LocalLBMessageRoutingTransportConfigLocator().getLocalLBMessageRoutingTransportConfigPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBMessageRoutingTransportConfig); return m_LocalLBMessageRoutingTransportConfig;}
public LocalLBMonitorBindingStub getLocalLBMonitor() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBMonitor ) { m_LocalLBMonitor = (iControl.LocalLBMonitorBindingStub) new iControl.LocalLBMonitorLocator().getLocalLBMonitorPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBMonitor); return m_LocalLBMonitor;}
public LocalLBNATBindingStub getLocalLBNAT() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBNAT ) { m_LocalLBNAT = (iControl.LocalLBNATBindingStub) new iControl.LocalLBNATLocator().getLocalLBNATPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBNAT); return m_LocalLBNAT;}
public LocalLBNATV2BindingStub getLocalLBNATV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBNATV2 ) { m_LocalLBNATV2 = (iControl.LocalLBNATV2BindingStub) new iControl.LocalLBNATV2Locator().getLocalLBNATV2Port(new java.net.URL(buildURL())); } setupInterface(m_LocalLBNATV2); return m_LocalLBNATV2;}
public LocalLBNodeAddressBindingStub getLocalLBNodeAddress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBNodeAddress ) { m_LocalLBNodeAddress = (iControl.LocalLBNodeAddressBindingStub) new iControl.LocalLBNodeAddressLocator().getLocalLBNodeAddressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBNodeAddress); return m_LocalLBNodeAddress;}
public LocalLBNodeAddressV2BindingStub getLocalLBNodeAddressV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBNodeAddressV2 ) { m_LocalLBNodeAddressV2 = (iControl.LocalLBNodeAddressV2BindingStub) new iControl.LocalLBNodeAddressV2Locator().getLocalLBNodeAddressV2Port(new java.net.URL(buildURL())); } setupInterface(m_LocalLBNodeAddressV2); return m_LocalLBNodeAddressV2;}
public LocalLBOCSPStaplingParametersBindingStub getLocalLBOCSPStaplingParameters() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBOCSPStaplingParameters ) { m_LocalLBOCSPStaplingParameters = (iControl.LocalLBOCSPStaplingParametersBindingStub) new iControl.LocalLBOCSPStaplingParametersLocator().getLocalLBOCSPStaplingParametersPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBOCSPStaplingParameters); return m_LocalLBOCSPStaplingParameters;}
public LocalLBPoolBindingStub getLocalLBPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBPool ) { m_LocalLBPool = (iControl.LocalLBPoolBindingStub) new iControl.LocalLBPoolLocator().getLocalLBPoolPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBPool); return m_LocalLBPool;}
public LocalLBPoolMemberBindingStub getLocalLBPoolMember() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBPoolMember ) { m_LocalLBPoolMember = (iControl.LocalLBPoolMemberBindingStub) new iControl.LocalLBPoolMemberLocator().getLocalLBPoolMemberPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBPoolMember); return m_LocalLBPoolMember;}
public LocalLBProfileAnalyticsBindingStub getLocalLBProfileAnalytics() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileAnalytics ) { m_LocalLBProfileAnalytics = (iControl.LocalLBProfileAnalyticsBindingStub) new iControl.LocalLBProfileAnalyticsLocator().getLocalLBProfileAnalyticsPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileAnalytics); return m_LocalLBProfileAnalytics;}
public LocalLBProfileAuthBindingStub getLocalLBProfileAuth() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileAuth ) { m_LocalLBProfileAuth = (iControl.LocalLBProfileAuthBindingStub) new iControl.LocalLBProfileAuthLocator().getLocalLBProfileAuthPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileAuth); return m_LocalLBProfileAuth;}
public LocalLBProfileClassificationBindingStub getLocalLBProfileClassification() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileClassification ) { m_LocalLBProfileClassification = (iControl.LocalLBProfileClassificationBindingStub) new iControl.LocalLBProfileClassificationLocator().getLocalLBProfileClassificationPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileClassification); return m_LocalLBProfileClassification;}
public LocalLBProfileClientLDAPBindingStub getLocalLBProfileClientLDAP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileClientLDAP ) { m_LocalLBProfileClientLDAP = (iControl.LocalLBProfileClientLDAPBindingStub) new iControl.LocalLBProfileClientLDAPLocator().getLocalLBProfileClientLDAPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileClientLDAP); return m_LocalLBProfileClientLDAP;}
public LocalLBProfileClientSSLBindingStub getLocalLBProfileClientSSL() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileClientSSL ) { m_LocalLBProfileClientSSL = (iControl.LocalLBProfileClientSSLBindingStub) new iControl.LocalLBProfileClientSSLLocator().getLocalLBProfileClientSSLPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileClientSSL); return m_LocalLBProfileClientSSL;}
public LocalLBProfileDiameterBindingStub getLocalLBProfileDiameter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileDiameter ) { m_LocalLBProfileDiameter = (iControl.LocalLBProfileDiameterBindingStub) new iControl.LocalLBProfileDiameterLocator().getLocalLBProfileDiameterPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileDiameter); return m_LocalLBProfileDiameter;}
public LocalLBProfileDiameterEndpointBindingStub getLocalLBProfileDiameterEndpoint() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileDiameterEndpoint ) { m_LocalLBProfileDiameterEndpoint = (iControl.LocalLBProfileDiameterEndpointBindingStub) new iControl.LocalLBProfileDiameterEndpointLocator().getLocalLBProfileDiameterEndpointPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileDiameterEndpoint); return m_LocalLBProfileDiameterEndpoint;}
public LocalLBProfileDNSBindingStub getLocalLBProfileDNS() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileDNS ) { m_LocalLBProfileDNS = (iControl.LocalLBProfileDNSBindingStub) new iControl.LocalLBProfileDNSLocator().getLocalLBProfileDNSPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileDNS); return m_LocalLBProfileDNS;}
public LocalLBProfileDNSLoggingBindingStub getLocalLBProfileDNSLogging() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileDNSLogging ) { m_LocalLBProfileDNSLogging = (iControl.LocalLBProfileDNSLoggingBindingStub) new iControl.LocalLBProfileDNSLoggingLocator().getLocalLBProfileDNSLoggingPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileDNSLogging); return m_LocalLBProfileDNSLogging;}
public LocalLBProfileFastHttpBindingStub getLocalLBProfileFastHttp() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFastHttp ) { m_LocalLBProfileFastHttp = (iControl.LocalLBProfileFastHttpBindingStub) new iControl.LocalLBProfileFastHttpLocator().getLocalLBProfileFastHttpPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFastHttp); return m_LocalLBProfileFastHttp;}
public LocalLBProfileFastL4BindingStub getLocalLBProfileFastL4() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFastL4 ) { m_LocalLBProfileFastL4 = (iControl.LocalLBProfileFastL4BindingStub) new iControl.LocalLBProfileFastL4Locator().getLocalLBProfileFastL4Port(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFastL4); return m_LocalLBProfileFastL4;}
public LocalLBProfileFIXBindingStub getLocalLBProfileFIX() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFIX ) { m_LocalLBProfileFIX = (iControl.LocalLBProfileFIXBindingStub) new iControl.LocalLBProfileFIXLocator().getLocalLBProfileFIXPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFIX); return m_LocalLBProfileFIX;}
public LocalLBProfileFTPBindingStub getLocalLBProfileFTP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileFTP ) { m_LocalLBProfileFTP = (iControl.LocalLBProfileFTPBindingStub) new iControl.LocalLBProfileFTPLocator().getLocalLBProfileFTPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileFTP); return m_LocalLBProfileFTP;}
public LocalLBProfileHttpBindingStub getLocalLBProfileHttp() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileHttp ) { m_LocalLBProfileHttp = (iControl.LocalLBProfileHttpBindingStub) new iControl.LocalLBProfileHttpLocator().getLocalLBProfileHttpPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileHttp); return m_LocalLBProfileHttp;}
public LocalLBProfileHttpClassBindingStub getLocalLBProfileHttpClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileHttpClass ) { m_LocalLBProfileHttpClass = (iControl.LocalLBProfileHttpClassBindingStub) new iControl.LocalLBProfileHttpClassLocator().getLocalLBProfileHttpClassPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileHttpClass); return m_LocalLBProfileHttpClass;}
public LocalLBProfileHttpCompressionBindingStub getLocalLBProfileHttpCompression() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileHttpCompression ) { m_LocalLBProfileHttpCompression = (iControl.LocalLBProfileHttpCompressionBindingStub) new iControl.LocalLBProfileHttpCompressionLocator().getLocalLBProfileHttpCompressionPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileHttpCompression); return m_LocalLBProfileHttpCompression;}
public LocalLBProfileICAPBindingStub getLocalLBProfileICAP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileICAP ) { m_LocalLBProfileICAP = (iControl.LocalLBProfileICAPBindingStub) new iControl.LocalLBProfileICAPLocator().getLocalLBProfileICAPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileICAP); return m_LocalLBProfileICAP;}
public LocalLBProfileIIOPBindingStub getLocalLBProfileIIOP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileIIOP ) { m_LocalLBProfileIIOP = (iControl.LocalLBProfileIIOPBindingStub) new iControl.LocalLBProfileIIOPLocator().getLocalLBProfileIIOPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileIIOP); return m_LocalLBProfileIIOP;}
public LocalLBProfileOneConnectBindingStub getLocalLBProfileOneConnect() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileOneConnect ) { m_LocalLBProfileOneConnect = (iControl.LocalLBProfileOneConnectBindingStub) new iControl.LocalLBProfileOneConnectLocator().getLocalLBProfileOneConnectPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileOneConnect); return m_LocalLBProfileOneConnect;}
public LocalLBProfilePCPBindingStub getLocalLBProfilePCP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfilePCP ) { m_LocalLBProfilePCP = (iControl.LocalLBProfilePCPBindingStub) new iControl.LocalLBProfilePCPLocator().getLocalLBProfilePCPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfilePCP); return m_LocalLBProfilePCP;}
public LocalLBProfilePersistenceBindingStub getLocalLBProfilePersistence() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfilePersistence ) { m_LocalLBProfilePersistence = (iControl.LocalLBProfilePersistenceBindingStub) new iControl.LocalLBProfilePersistenceLocator().getLocalLBProfilePersistencePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfilePersistence); return m_LocalLBProfilePersistence;}
public LocalLBProfilePPTPBindingStub getLocalLBProfilePPTP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfilePPTP ) { m_LocalLBProfilePPTP = (iControl.LocalLBProfilePPTPBindingStub) new iControl.LocalLBProfilePPTPLocator().getLocalLBProfilePPTPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfilePPTP); return m_LocalLBProfilePPTP;}
public LocalLBProfileRADIUSBindingStub getLocalLBProfileRADIUS() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileRADIUS ) { m_LocalLBProfileRADIUS = (iControl.LocalLBProfileRADIUSBindingStub) new iControl.LocalLBProfileRADIUSLocator().getLocalLBProfileRADIUSPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileRADIUS); return m_LocalLBProfileRADIUS;}
public LocalLBProfileRequestAdaptBindingStub getLocalLBProfileRequestAdapt() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileRequestAdapt ) { m_LocalLBProfileRequestAdapt = (iControl.LocalLBProfileRequestAdaptBindingStub) new iControl.LocalLBProfileRequestAdaptLocator().getLocalLBProfileRequestAdaptPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileRequestAdapt); return m_LocalLBProfileRequestAdapt;}
public LocalLBProfileRequestLoggingBindingStub getLocalLBProfileRequestLogging() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileRequestLogging ) { m_LocalLBProfileRequestLogging = (iControl.LocalLBProfileRequestLoggingBindingStub) new iControl.LocalLBProfileRequestLoggingLocator().getLocalLBProfileRequestLoggingPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileRequestLogging); return m_LocalLBProfileRequestLogging;}
public LocalLBProfileResponseAdaptBindingStub getLocalLBProfileResponseAdapt() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileResponseAdapt ) { m_LocalLBProfileResponseAdapt = (iControl.LocalLBProfileResponseAdaptBindingStub) new iControl.LocalLBProfileResponseAdaptLocator().getLocalLBProfileResponseAdaptPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileResponseAdapt); return m_LocalLBProfileResponseAdapt;}
public LocalLBProfileRTSPBindingStub getLocalLBProfileRTSP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileRTSP ) { m_LocalLBProfileRTSP = (iControl.LocalLBProfileRTSPBindingStub) new iControl.LocalLBProfileRTSPLocator().getLocalLBProfileRTSPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileRTSP); return m_LocalLBProfileRTSP;}
public LocalLBProfileSCTPBindingStub getLocalLBProfileSCTP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSCTP ) { m_LocalLBProfileSCTP = (iControl.LocalLBProfileSCTPBindingStub) new iControl.LocalLBProfileSCTPLocator().getLocalLBProfileSCTPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSCTP); return m_LocalLBProfileSCTP;}
public LocalLBProfileServerLDAPBindingStub getLocalLBProfileServerLDAP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileServerLDAP ) { m_LocalLBProfileServerLDAP = (iControl.LocalLBProfileServerLDAPBindingStub) new iControl.LocalLBProfileServerLDAPLocator().getLocalLBProfileServerLDAPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileServerLDAP); return m_LocalLBProfileServerLDAP;}
public LocalLBProfileServerSSLBindingStub getLocalLBProfileServerSSL() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileServerSSL ) { m_LocalLBProfileServerSSL = (iControl.LocalLBProfileServerSSLBindingStub) new iControl.LocalLBProfileServerSSLLocator().getLocalLBProfileServerSSLPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileServerSSL); return m_LocalLBProfileServerSSL;}
public LocalLBProfileSIPBindingStub getLocalLBProfileSIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSIP ) { m_LocalLBProfileSIP = (iControl.LocalLBProfileSIPBindingStub) new iControl.LocalLBProfileSIPLocator().getLocalLBProfileSIPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSIP); return m_LocalLBProfileSIP;}
public LocalLBProfileSIPRouterBindingStub getLocalLBProfileSIPRouter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSIPRouter ) { m_LocalLBProfileSIPRouter = (iControl.LocalLBProfileSIPRouterBindingStub) new iControl.LocalLBProfileSIPRouterLocator().getLocalLBProfileSIPRouterPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSIPRouter); return m_LocalLBProfileSIPRouter;}
public LocalLBProfileSIPSessionBindingStub getLocalLBProfileSIPSession() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSIPSession ) { m_LocalLBProfileSIPSession = (iControl.LocalLBProfileSIPSessionBindingStub) new iControl.LocalLBProfileSIPSessionLocator().getLocalLBProfileSIPSessionPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSIPSession); return m_LocalLBProfileSIPSession;}
public LocalLBProfileSMTPSBindingStub getLocalLBProfileSMTPS() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSMTPS ) { m_LocalLBProfileSMTPS = (iControl.LocalLBProfileSMTPSBindingStub) new iControl.LocalLBProfileSMTPSLocator().getLocalLBProfileSMTPSPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSMTPS); return m_LocalLBProfileSMTPS;}
public LocalLBProfileSPDYBindingStub getLocalLBProfileSPDY() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSPDY ) { m_LocalLBProfileSPDY = (iControl.LocalLBProfileSPDYBindingStub) new iControl.LocalLBProfileSPDYLocator().getLocalLBProfileSPDYPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSPDY); return m_LocalLBProfileSPDY;}
public LocalLBProfileSPMBindingStub getLocalLBProfileSPM() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileSPM ) { m_LocalLBProfileSPM = (iControl.LocalLBProfileSPMBindingStub) new iControl.LocalLBProfileSPMLocator().getLocalLBProfileSPMPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileSPM); return m_LocalLBProfileSPM;}
public LocalLBProfileStreamBindingStub getLocalLBProfileStream() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileStream ) { m_LocalLBProfileStream = (iControl.LocalLBProfileStreamBindingStub) new iControl.LocalLBProfileStreamLocator().getLocalLBProfileStreamPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileStream); return m_LocalLBProfileStream;}
public LocalLBProfileTCPBindingStub getLocalLBProfileTCP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileTCP ) { m_LocalLBProfileTCP = (iControl.LocalLBProfileTCPBindingStub) new iControl.LocalLBProfileTCPLocator().getLocalLBProfileTCPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileTCP); return m_LocalLBProfileTCP;}
public LocalLBProfileTCPAnalyticsBindingStub getLocalLBProfileTCPAnalytics() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileTCPAnalytics ) { m_LocalLBProfileTCPAnalytics = (iControl.LocalLBProfileTCPAnalyticsBindingStub) new iControl.LocalLBProfileTCPAnalyticsLocator().getLocalLBProfileTCPAnalyticsPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileTCPAnalytics); return m_LocalLBProfileTCPAnalytics;}
public LocalLBProfileTFTPBindingStub getLocalLBProfileTFTP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileTFTP ) { m_LocalLBProfileTFTP = (iControl.LocalLBProfileTFTPBindingStub) new iControl.LocalLBProfileTFTPLocator().getLocalLBProfileTFTPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileTFTP); return m_LocalLBProfileTFTP;}
public LocalLBProfileUDPBindingStub getLocalLBProfileUDP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileUDP ) { m_LocalLBProfileUDP = (iControl.LocalLBProfileUDPBindingStub) new iControl.LocalLBProfileUDPLocator().getLocalLBProfileUDPPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileUDP); return m_LocalLBProfileUDP;}
public LocalLBProfileUserStatisticBindingStub getLocalLBProfileUserStatistic() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileUserStatistic ) { m_LocalLBProfileUserStatistic = (iControl.LocalLBProfileUserStatisticBindingStub) new iControl.LocalLBProfileUserStatisticLocator().getLocalLBProfileUserStatisticPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileUserStatistic); return m_LocalLBProfileUserStatistic;}
public LocalLBProfileWebAccelerationBindingStub getLocalLBProfileWebAcceleration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileWebAcceleration ) { m_LocalLBProfileWebAcceleration = (iControl.LocalLBProfileWebAccelerationBindingStub) new iControl.LocalLBProfileWebAccelerationLocator().getLocalLBProfileWebAccelerationPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileWebAcceleration); return m_LocalLBProfileWebAcceleration;}
public LocalLBProfileXMLBindingStub getLocalLBProfileXML() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBProfileXML ) { m_LocalLBProfileXML = (iControl.LocalLBProfileXMLBindingStub) new iControl.LocalLBProfileXMLLocator().getLocalLBProfileXMLPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBProfileXML); return m_LocalLBProfileXML;}
public LocalLBRAMCacheInformationBindingStub getLocalLBRAMCacheInformation() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBRAMCacheInformation ) { m_LocalLBRAMCacheInformation = (iControl.LocalLBRAMCacheInformationBindingStub) new iControl.LocalLBRAMCacheInformationLocator().getLocalLBRAMCacheInformationPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBRAMCacheInformation); return m_LocalLBRAMCacheInformation;}
public LocalLBRateClassBindingStub getLocalLBRateClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBRateClass ) { m_LocalLBRateClass = (iControl.LocalLBRateClassBindingStub) new iControl.LocalLBRateClassLocator().getLocalLBRateClassPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBRateClass); return m_LocalLBRateClass;}
public LocalLBRuleBindingStub getLocalLBRule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBRule ) { m_LocalLBRule = (iControl.LocalLBRuleBindingStub) new iControl.LocalLBRuleLocator().getLocalLBRulePort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBRule); return m_LocalLBRule;}
public LocalLBSNATBindingStub getLocalLBSNAT() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNAT ) { m_LocalLBSNAT = (iControl.LocalLBSNATBindingStub) new iControl.LocalLBSNATLocator().getLocalLBSNATPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNAT); return m_LocalLBSNAT;}
public LocalLBSNATPoolBindingStub getLocalLBSNATPool() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATPool ) { m_LocalLBSNATPool = (iControl.LocalLBSNATPoolBindingStub) new iControl.LocalLBSNATPoolLocator().getLocalLBSNATPoolPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATPool); return m_LocalLBSNATPool;}
public LocalLBSNATPoolMemberBindingStub getLocalLBSNATPoolMember() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATPoolMember ) { m_LocalLBSNATPoolMember = (iControl.LocalLBSNATPoolMemberBindingStub) new iControl.LocalLBSNATPoolMemberLocator().getLocalLBSNATPoolMemberPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATPoolMember); return m_LocalLBSNATPoolMember;}
public LocalLBSNATTranslationAddressBindingStub getLocalLBSNATTranslationAddress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATTranslationAddress ) { m_LocalLBSNATTranslationAddress = (iControl.LocalLBSNATTranslationAddressBindingStub) new iControl.LocalLBSNATTranslationAddressLocator().getLocalLBSNATTranslationAddressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATTranslationAddress); return m_LocalLBSNATTranslationAddress;}
public LocalLBSNATTranslationAddressV2BindingStub getLocalLBSNATTranslationAddressV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBSNATTranslationAddressV2 ) { m_LocalLBSNATTranslationAddressV2 = (iControl.LocalLBSNATTranslationAddressV2BindingStub) new iControl.LocalLBSNATTranslationAddressV2Locator().getLocalLBSNATTranslationAddressV2Port(new java.net.URL(buildURL())); } setupInterface(m_LocalLBSNATTranslationAddressV2); return m_LocalLBSNATTranslationAddressV2;}
public LocalLBVirtualAddressBindingStub getLocalLBVirtualAddress() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBVirtualAddress ) { m_LocalLBVirtualAddress = (iControl.LocalLBVirtualAddressBindingStub) new iControl.LocalLBVirtualAddressLocator().getLocalLBVirtualAddressPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBVirtualAddress); return m_LocalLBVirtualAddress;}
public LocalLBVirtualAddressV2BindingStub getLocalLBVirtualAddressV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBVirtualAddressV2 ) { m_LocalLBVirtualAddressV2 = (iControl.LocalLBVirtualAddressV2BindingStub) new iControl.LocalLBVirtualAddressV2Locator().getLocalLBVirtualAddressV2Port(new java.net.URL(buildURL())); } setupInterface(m_LocalLBVirtualAddressV2); return m_LocalLBVirtualAddressV2;}
public LocalLBVirtualServerBindingStub getLocalLBVirtualServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LocalLBVirtualServer ) { m_LocalLBVirtualServer = (iControl.LocalLBVirtualServerBindingStub) new iControl.LocalLBVirtualServerLocator().getLocalLBVirtualServerPort(new java.net.URL(buildURL())); } setupInterface(m_LocalLBVirtualServer); return m_LocalLBVirtualServer;}
public LogDestinationArcSightBindingStub getLogDestinationArcSight() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationArcSight ) { m_LogDestinationArcSight = (iControl.LogDestinationArcSightBindingStub) new iControl.LogDestinationArcSightLocator().getLogDestinationArcSightPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationArcSight); return m_LogDestinationArcSight;}
public LogDestinationIPFIXBindingStub getLogDestinationIPFIX() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationIPFIX ) { m_LogDestinationIPFIX = (iControl.LogDestinationIPFIXBindingStub) new iControl.LogDestinationIPFIXLocator().getLogDestinationIPFIXPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationIPFIX); return m_LogDestinationIPFIX;}
public LogDestinationLocalSyslogBindingStub getLogDestinationLocalSyslog() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationLocalSyslog ) { m_LogDestinationLocalSyslog = (iControl.LogDestinationLocalSyslogBindingStub) new iControl.LogDestinationLocalSyslogLocator().getLogDestinationLocalSyslogPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationLocalSyslog); return m_LogDestinationLocalSyslog;}
public LogDestinationManagementPortBindingStub getLogDestinationManagementPort() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationManagementPort ) { m_LogDestinationManagementPort = (iControl.LogDestinationManagementPortBindingStub) new iControl.LogDestinationManagementPortLocator().getLogDestinationManagementPortPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationManagementPort); return m_LogDestinationManagementPort;}
public LogDestinationRemoteHighSpeedLogBindingStub getLogDestinationRemoteHighSpeedLog() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationRemoteHighSpeedLog ) { m_LogDestinationRemoteHighSpeedLog = (iControl.LogDestinationRemoteHighSpeedLogBindingStub) new iControl.LogDestinationRemoteHighSpeedLogLocator().getLogDestinationRemoteHighSpeedLogPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationRemoteHighSpeedLog); return m_LogDestinationRemoteHighSpeedLog;}
public LogDestinationRemoteSyslogBindingStub getLogDestinationRemoteSyslog() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationRemoteSyslog ) { m_LogDestinationRemoteSyslog = (iControl.LogDestinationRemoteSyslogBindingStub) new iControl.LogDestinationRemoteSyslogLocator().getLogDestinationRemoteSyslogPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationRemoteSyslog); return m_LogDestinationRemoteSyslog;}
public LogDestinationSplunkBindingStub getLogDestinationSplunk() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogDestinationSplunk ) { m_LogDestinationSplunk = (iControl.LogDestinationSplunkBindingStub) new iControl.LogDestinationSplunkLocator().getLogDestinationSplunkPort(new java.net.URL(buildURL())); } setupInterface(m_LogDestinationSplunk); return m_LogDestinationSplunk;}
public LogFilterBindingStub getLogFilter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogFilter ) { m_LogFilter = (iControl.LogFilterBindingStub) new iControl.LogFilterLocator().getLogFilterPort(new java.net.URL(buildURL())); } setupInterface(m_LogFilter); return m_LogFilter;}
public LogIPFIXInformationElementBindingStub getLogIPFIXInformationElement() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogIPFIXInformationElement ) { m_LogIPFIXInformationElement = (iControl.LogIPFIXInformationElementBindingStub) new iControl.LogIPFIXInformationElementLocator().getLogIPFIXInformationElementPort(new java.net.URL(buildURL())); } setupInterface(m_LogIPFIXInformationElement); return m_LogIPFIXInformationElement;}
public LogPublisherBindingStub getLogPublisher() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LogPublisher ) { m_LogPublisher = (iControl.LogPublisherBindingStub) new iControl.LogPublisherLocator().getLogPublisherPort(new java.net.URL(buildURL())); } setupInterface(m_LogPublisher); return m_LogPublisher;}
public LTConfigClassBindingStub getLTConfigClass() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LTConfigClass ) { m_LTConfigClass = (iControl.LTConfigClassBindingStub) new iControl.LTConfigClassLocator().getLTConfigClassPort(new java.net.URL(buildURL())); } setupInterface(m_LTConfigClass); return m_LTConfigClass;}
public LTConfigFieldBindingStub getLTConfigField() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_LTConfigField ) { m_LTConfigField = (iControl.LTConfigFieldBindingStub) new iControl.LTConfigFieldLocator().getLTConfigFieldPort(new java.net.URL(buildURL())); } setupInterface(m_LTConfigField); return m_LTConfigField;}
public ManagementApplicationPresentationScriptBindingStub getManagementApplicationPresentationScript() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementApplicationPresentationScript ) { m_ManagementApplicationPresentationScript = (iControl.ManagementApplicationPresentationScriptBindingStub) new iControl.ManagementApplicationPresentationScriptLocator().getManagementApplicationPresentationScriptPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementApplicationPresentationScript); return m_ManagementApplicationPresentationScript;}
public ManagementApplicationServiceBindingStub getManagementApplicationService() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementApplicationService ) { m_ManagementApplicationService = (iControl.ManagementApplicationServiceBindingStub) new iControl.ManagementApplicationServiceLocator().getManagementApplicationServicePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementApplicationService); return m_ManagementApplicationService;}
public ManagementApplicationTemplateBindingStub getManagementApplicationTemplate() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementApplicationTemplate ) { m_ManagementApplicationTemplate = (iControl.ManagementApplicationTemplateBindingStub) new iControl.ManagementApplicationTemplateLocator().getManagementApplicationTemplatePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementApplicationTemplate); return m_ManagementApplicationTemplate;}
public ManagementCCLDAPConfigurationBindingStub getManagementCCLDAPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCCLDAPConfiguration ) { m_ManagementCCLDAPConfiguration = (iControl.ManagementCCLDAPConfigurationBindingStub) new iControl.ManagementCCLDAPConfigurationLocator().getManagementCCLDAPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCCLDAPConfiguration); return m_ManagementCCLDAPConfiguration;}
public ManagementCertLDAPConfigurationBindingStub getManagementCertLDAPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCertLDAPConfiguration ) { m_ManagementCertLDAPConfiguration = (iControl.ManagementCertLDAPConfigurationBindingStub) new iControl.ManagementCertLDAPConfigurationLocator().getManagementCertLDAPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCertLDAPConfiguration); return m_ManagementCertLDAPConfiguration;}
public ManagementCLIScriptBindingStub getManagementCLIScript() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCLIScript ) { m_ManagementCLIScript = (iControl.ManagementCLIScriptBindingStub) new iControl.ManagementCLIScriptLocator().getManagementCLIScriptPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCLIScript); return m_ManagementCLIScript;}
public ManagementCRLDPConfigurationBindingStub getManagementCRLDPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCRLDPConfiguration ) { m_ManagementCRLDPConfiguration = (iControl.ManagementCRLDPConfigurationBindingStub) new iControl.ManagementCRLDPConfigurationLocator().getManagementCRLDPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCRLDPConfiguration); return m_ManagementCRLDPConfiguration;}
public ManagementCRLDPServerBindingStub getManagementCRLDPServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementCRLDPServer ) { m_ManagementCRLDPServer = (iControl.ManagementCRLDPServerBindingStub) new iControl.ManagementCRLDPServerLocator().getManagementCRLDPServerPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementCRLDPServer); return m_ManagementCRLDPServer;}
public ManagementDBVariableBindingStub getManagementDBVariable() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementDBVariable ) { m_ManagementDBVariable = (iControl.ManagementDBVariableBindingStub) new iControl.ManagementDBVariableLocator().getManagementDBVariablePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementDBVariable); return m_ManagementDBVariable;}
public ManagementDeviceBindingStub getManagementDevice() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementDevice ) { m_ManagementDevice = (iControl.ManagementDeviceBindingStub) new iControl.ManagementDeviceLocator().getManagementDevicePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementDevice); return m_ManagementDevice;}
public ManagementDeviceGroupBindingStub getManagementDeviceGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementDeviceGroup ) { m_ManagementDeviceGroup = (iControl.ManagementDeviceGroupBindingStub) new iControl.ManagementDeviceGroupLocator().getManagementDeviceGroupPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementDeviceGroup); return m_ManagementDeviceGroup;}
public ManagementEMBindingStub getManagementEM() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementEM ) { m_ManagementEM = (iControl.ManagementEMBindingStub) new iControl.ManagementEMLocator().getManagementEMPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementEM); return m_ManagementEM;}
public ManagementEventNotificationBindingStub getManagementEventNotification() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementEventNotification ) { m_ManagementEventNotification = (iControl.ManagementEventNotificationBindingStub) new iControl.ManagementEventNotificationLocator().getManagementEventNotificationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementEventNotification); return m_ManagementEventNotification;}
public ManagementEventSubscriptionBindingStub getManagementEventSubscription() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementEventSubscription ) { m_ManagementEventSubscription = (iControl.ManagementEventSubscriptionBindingStub) new iControl.ManagementEventSubscriptionLocator().getManagementEventSubscriptionPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementEventSubscription); return m_ManagementEventSubscription;}
public ManagementFeatureModuleBindingStub getManagementFeatureModule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementFeatureModule ) { m_ManagementFeatureModule = (iControl.ManagementFeatureModuleBindingStub) new iControl.ManagementFeatureModuleLocator().getManagementFeatureModulePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementFeatureModule); return m_ManagementFeatureModule;}
public ManagementFolderBindingStub getManagementFolder() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementFolder ) { m_ManagementFolder = (iControl.ManagementFolderBindingStub) new iControl.ManagementFolderLocator().getManagementFolderPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementFolder); return m_ManagementFolder;}
public ManagementGlobalsBindingStub getManagementGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementGlobals ) { m_ManagementGlobals = (iControl.ManagementGlobalsBindingStub) new iControl.ManagementGlobalsLocator().getManagementGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementGlobals); return m_ManagementGlobals;}
public ManagementKeyCertificateBindingStub getManagementKeyCertificate() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementKeyCertificate ) { m_ManagementKeyCertificate = (iControl.ManagementKeyCertificateBindingStub) new iControl.ManagementKeyCertificateLocator().getManagementKeyCertificatePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementKeyCertificate); return m_ManagementKeyCertificate;}
public ManagementLDAPConfigurationBindingStub getManagementLDAPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementLDAPConfiguration ) { m_ManagementLDAPConfiguration = (iControl.ManagementLDAPConfigurationBindingStub) new iControl.ManagementLDAPConfigurationLocator().getManagementLDAPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementLDAPConfiguration); return m_ManagementLDAPConfiguration;}
public ManagementLicenseAdministrationBindingStub getManagementLicenseAdministration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementLicenseAdministration ) { m_ManagementLicenseAdministration = (iControl.ManagementLicenseAdministrationBindingStub) new iControl.ManagementLicenseAdministrationLocator().getManagementLicenseAdministrationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementLicenseAdministration); return m_ManagementLicenseAdministration;}
public ManagementNamedBindingStub getManagementNamed() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementNamed ) { m_ManagementNamed = (iControl.ManagementNamedBindingStub) new iControl.ManagementNamedLocator().getManagementNamedPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementNamed); return m_ManagementNamed;}
public ManagementOCSPConfigurationBindingStub getManagementOCSPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementOCSPConfiguration ) { m_ManagementOCSPConfiguration = (iControl.ManagementOCSPConfigurationBindingStub) new iControl.ManagementOCSPConfigurationLocator().getManagementOCSPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementOCSPConfiguration); return m_ManagementOCSPConfiguration;}
public ManagementOCSPResponderBindingStub getManagementOCSPResponder() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementOCSPResponder ) { m_ManagementOCSPResponder = (iControl.ManagementOCSPResponderBindingStub) new iControl.ManagementOCSPResponderLocator().getManagementOCSPResponderPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementOCSPResponder); return m_ManagementOCSPResponder;}
public ManagementPartitionBindingStub getManagementPartition() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementPartition ) { m_ManagementPartition = (iControl.ManagementPartitionBindingStub) new iControl.ManagementPartitionLocator().getManagementPartitionPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementPartition); return m_ManagementPartition;}
public ManagementProvisionBindingStub getManagementProvision() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementProvision ) { m_ManagementProvision = (iControl.ManagementProvisionBindingStub) new iControl.ManagementProvisionLocator().getManagementProvisionPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementProvision); return m_ManagementProvision;}
public ManagementRADIUSConfigurationBindingStub getManagementRADIUSConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementRADIUSConfiguration ) { m_ManagementRADIUSConfiguration = (iControl.ManagementRADIUSConfigurationBindingStub) new iControl.ManagementRADIUSConfigurationLocator().getManagementRADIUSConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementRADIUSConfiguration); return m_ManagementRADIUSConfiguration;}
public ManagementRADIUSServerBindingStub getManagementRADIUSServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementRADIUSServer ) { m_ManagementRADIUSServer = (iControl.ManagementRADIUSServerBindingStub) new iControl.ManagementRADIUSServerLocator().getManagementRADIUSServerPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementRADIUSServer); return m_ManagementRADIUSServer;}
public ManagementResourceRecordBindingStub getManagementResourceRecord() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementResourceRecord ) { m_ManagementResourceRecord = (iControl.ManagementResourceRecordBindingStub) new iControl.ManagementResourceRecordLocator().getManagementResourceRecordPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementResourceRecord); return m_ManagementResourceRecord;}
public ManagementSFlowDataSourceBindingStub getManagementSFlowDataSource() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementSFlowDataSource ) { m_ManagementSFlowDataSource = (iControl.ManagementSFlowDataSourceBindingStub) new iControl.ManagementSFlowDataSourceLocator().getManagementSFlowDataSourcePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementSFlowDataSource); return m_ManagementSFlowDataSource;}
public ManagementSFlowGlobalsBindingStub getManagementSFlowGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementSFlowGlobals ) { m_ManagementSFlowGlobals = (iControl.ManagementSFlowGlobalsBindingStub) new iControl.ManagementSFlowGlobalsLocator().getManagementSFlowGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementSFlowGlobals); return m_ManagementSFlowGlobals;}
public ManagementSFlowReceiverBindingStub getManagementSFlowReceiver() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementSFlowReceiver ) { m_ManagementSFlowReceiver = (iControl.ManagementSFlowReceiverBindingStub) new iControl.ManagementSFlowReceiverLocator().getManagementSFlowReceiverPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementSFlowReceiver); return m_ManagementSFlowReceiver;}
public ManagementSMTPConfigurationBindingStub getManagementSMTPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementSMTPConfiguration ) { m_ManagementSMTPConfiguration = (iControl.ManagementSMTPConfigurationBindingStub) new iControl.ManagementSMTPConfigurationLocator().getManagementSMTPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementSMTPConfiguration); return m_ManagementSMTPConfiguration;}
public ManagementSNMPConfigurationBindingStub getManagementSNMPConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementSNMPConfiguration ) { m_ManagementSNMPConfiguration = (iControl.ManagementSNMPConfigurationBindingStub) new iControl.ManagementSNMPConfigurationLocator().getManagementSNMPConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementSNMPConfiguration); return m_ManagementSNMPConfiguration;}
public ManagementTACACSConfigurationBindingStub getManagementTACACSConfiguration() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementTACACSConfiguration ) { m_ManagementTACACSConfiguration = (iControl.ManagementTACACSConfigurationBindingStub) new iControl.ManagementTACACSConfigurationLocator().getManagementTACACSConfigurationPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementTACACSConfiguration); return m_ManagementTACACSConfiguration;}
public ManagementTMOSModuleBindingStub getManagementTMOSModule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementTMOSModule ) { m_ManagementTMOSModule = (iControl.ManagementTMOSModuleBindingStub) new iControl.ManagementTMOSModuleLocator().getManagementTMOSModulePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementTMOSModule); return m_ManagementTMOSModule;}
public ManagementTrafficGroupBindingStub getManagementTrafficGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementTrafficGroup ) { m_ManagementTrafficGroup = (iControl.ManagementTrafficGroupBindingStub) new iControl.ManagementTrafficGroupLocator().getManagementTrafficGroupPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementTrafficGroup); return m_ManagementTrafficGroup;}
public ManagementTrustBindingStub getManagementTrust() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementTrust ) { m_ManagementTrust = (iControl.ManagementTrustBindingStub) new iControl.ManagementTrustLocator().getManagementTrustPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementTrust); return m_ManagementTrust;}
public ManagementUserManagementBindingStub getManagementUserManagement() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementUserManagement ) { m_ManagementUserManagement = (iControl.ManagementUserManagementBindingStub) new iControl.ManagementUserManagementLocator().getManagementUserManagementPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementUserManagement); return m_ManagementUserManagement;}
public ManagementViewBindingStub getManagementView() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementView ) { m_ManagementView = (iControl.ManagementViewBindingStub) new iControl.ManagementViewLocator().getManagementViewPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementView); return m_ManagementView;}
public ManagementZoneBindingStub getManagementZone() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementZone ) { m_ManagementZone = (iControl.ManagementZoneBindingStub) new iControl.ManagementZoneLocator().getManagementZonePort(new java.net.URL(buildURL())); } setupInterface(m_ManagementZone); return m_ManagementZone;}
public ManagementZoneRunnerBindingStub getManagementZoneRunner() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_ManagementZoneRunner ) { m_ManagementZoneRunner = (iControl.ManagementZoneRunnerBindingStub) new iControl.ManagementZoneRunnerLocator().getManagementZoneRunnerPort(new java.net.URL(buildURL())); } setupInterface(m_ManagementZoneRunner); return m_ManagementZoneRunner;}
public NetworkingAdminIPBindingStub getNetworkingAdminIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingAdminIP ) { m_NetworkingAdminIP = (iControl.NetworkingAdminIPBindingStub) new iControl.NetworkingAdminIPLocator().getNetworkingAdminIPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingAdminIP); return m_NetworkingAdminIP;}
public NetworkingARPBindingStub getNetworkingARP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingARP ) { m_NetworkingARP = (iControl.NetworkingARPBindingStub) new iControl.NetworkingARPLocator().getNetworkingARPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingARP); return m_NetworkingARP;}
public NetworkingBWControllerPolicyBindingStub getNetworkingBWControllerPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingBWControllerPolicy ) { m_NetworkingBWControllerPolicy = (iControl.NetworkingBWControllerPolicyBindingStub) new iControl.NetworkingBWControllerPolicyLocator().getNetworkingBWControllerPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingBWControllerPolicy); return m_NetworkingBWControllerPolicy;}
public NetworkingBWPriorityGroupBindingStub getNetworkingBWPriorityGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingBWPriorityGroup ) { m_NetworkingBWPriorityGroup = (iControl.NetworkingBWPriorityGroupBindingStub) new iControl.NetworkingBWPriorityGroupLocator().getNetworkingBWPriorityGroupPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingBWPriorityGroup); return m_NetworkingBWPriorityGroup;}
public NetworkingDNSResolverBindingStub getNetworkingDNSResolver() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingDNSResolver ) { m_NetworkingDNSResolver = (iControl.NetworkingDNSResolverBindingStub) new iControl.NetworkingDNSResolverLocator().getNetworkingDNSResolverPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingDNSResolver); return m_NetworkingDNSResolver;}
public NetworkingInterfacesBindingStub getNetworkingInterfaces() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingInterfaces ) { m_NetworkingInterfaces = (iControl.NetworkingInterfacesBindingStub) new iControl.NetworkingInterfacesLocator().getNetworkingInterfacesPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingInterfaces); return m_NetworkingInterfaces;}
public NetworkingIPsecIkeDaemonBindingStub getNetworkingIPsecIkeDaemon() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingIPsecIkeDaemon ) { m_NetworkingIPsecIkeDaemon = (iControl.NetworkingIPsecIkeDaemonBindingStub) new iControl.NetworkingIPsecIkeDaemonLocator().getNetworkingIPsecIkeDaemonPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingIPsecIkeDaemon); return m_NetworkingIPsecIkeDaemon;}
public NetworkingIPsecIkePeerBindingStub getNetworkingIPsecIkePeer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingIPsecIkePeer ) { m_NetworkingIPsecIkePeer = (iControl.NetworkingIPsecIkePeerBindingStub) new iControl.NetworkingIPsecIkePeerLocator().getNetworkingIPsecIkePeerPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingIPsecIkePeer); return m_NetworkingIPsecIkePeer;}
public NetworkingIPsecManualSecurityAssociationBindingStub getNetworkingIPsecManualSecurityAssociation() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingIPsecManualSecurityAssociation ) { m_NetworkingIPsecManualSecurityAssociation = (iControl.NetworkingIPsecManualSecurityAssociationBindingStub) new iControl.NetworkingIPsecManualSecurityAssociationLocator().getNetworkingIPsecManualSecurityAssociationPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingIPsecManualSecurityAssociation); return m_NetworkingIPsecManualSecurityAssociation;}
public NetworkingIPsecPolicyBindingStub getNetworkingIPsecPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingIPsecPolicy ) { m_NetworkingIPsecPolicy = (iControl.NetworkingIPsecPolicyBindingStub) new iControl.NetworkingIPsecPolicyLocator().getNetworkingIPsecPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingIPsecPolicy); return m_NetworkingIPsecPolicy;}
public NetworkingIPsecTrafficSelectorBindingStub getNetworkingIPsecTrafficSelector() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingIPsecTrafficSelector ) { m_NetworkingIPsecTrafficSelector = (iControl.NetworkingIPsecTrafficSelectorBindingStub) new iControl.NetworkingIPsecTrafficSelectorLocator().getNetworkingIPsecTrafficSelectorPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingIPsecTrafficSelector); return m_NetworkingIPsecTrafficSelector;}
public NetworkingiSessionAdvertisedRouteBindingStub getNetworkingiSessionAdvertisedRoute() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionAdvertisedRoute ) { m_NetworkingiSessionAdvertisedRoute = (iControl.NetworkingiSessionAdvertisedRouteBindingStub) new iControl.NetworkingiSessionAdvertisedRouteLocator().getNetworkingiSessionAdvertisedRoutePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionAdvertisedRoute); return m_NetworkingiSessionAdvertisedRoute;}
public NetworkingiSessionAdvertisedRouteV2BindingStub getNetworkingiSessionAdvertisedRouteV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionAdvertisedRouteV2 ) { m_NetworkingiSessionAdvertisedRouteV2 = (iControl.NetworkingiSessionAdvertisedRouteV2BindingStub) new iControl.NetworkingiSessionAdvertisedRouteV2Locator().getNetworkingiSessionAdvertisedRouteV2Port(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionAdvertisedRouteV2); return m_NetworkingiSessionAdvertisedRouteV2;}
public NetworkingiSessionDatastorBindingStub getNetworkingiSessionDatastor() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionDatastor ) { m_NetworkingiSessionDatastor = (iControl.NetworkingiSessionDatastorBindingStub) new iControl.NetworkingiSessionDatastorLocator().getNetworkingiSessionDatastorPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionDatastor); return m_NetworkingiSessionDatastor;}
public NetworkingiSessionDeduplicationBindingStub getNetworkingiSessionDeduplication() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionDeduplication ) { m_NetworkingiSessionDeduplication = (iControl.NetworkingiSessionDeduplicationBindingStub) new iControl.NetworkingiSessionDeduplicationLocator().getNetworkingiSessionDeduplicationPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionDeduplication); return m_NetworkingiSessionDeduplication;}
public NetworkingiSessionLocalInterfaceBindingStub getNetworkingiSessionLocalInterface() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionLocalInterface ) { m_NetworkingiSessionLocalInterface = (iControl.NetworkingiSessionLocalInterfaceBindingStub) new iControl.NetworkingiSessionLocalInterfaceLocator().getNetworkingiSessionLocalInterfacePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionLocalInterface); return m_NetworkingiSessionLocalInterface;}
public NetworkingiSessionPeerDiscoveryBindingStub getNetworkingiSessionPeerDiscovery() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionPeerDiscovery ) { m_NetworkingiSessionPeerDiscovery = (iControl.NetworkingiSessionPeerDiscoveryBindingStub) new iControl.NetworkingiSessionPeerDiscoveryLocator().getNetworkingiSessionPeerDiscoveryPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionPeerDiscovery); return m_NetworkingiSessionPeerDiscovery;}
public NetworkingiSessionRemoteInterfaceBindingStub getNetworkingiSessionRemoteInterface() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionRemoteInterface ) { m_NetworkingiSessionRemoteInterface = (iControl.NetworkingiSessionRemoteInterfaceBindingStub) new iControl.NetworkingiSessionRemoteInterfaceLocator().getNetworkingiSessionRemoteInterfacePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionRemoteInterface); return m_NetworkingiSessionRemoteInterface;}
public NetworkingiSessionRemoteInterfaceV2BindingStub getNetworkingiSessionRemoteInterfaceV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingiSessionRemoteInterfaceV2 ) { m_NetworkingiSessionRemoteInterfaceV2 = (iControl.NetworkingiSessionRemoteInterfaceV2BindingStub) new iControl.NetworkingiSessionRemoteInterfaceV2Locator().getNetworkingiSessionRemoteInterfaceV2Port(new java.net.URL(buildURL())); } setupInterface(m_NetworkingiSessionRemoteInterfaceV2); return m_NetworkingiSessionRemoteInterfaceV2;}
public NetworkingLLDPGlobalsBindingStub getNetworkingLLDPGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingLLDPGlobals ) { m_NetworkingLLDPGlobals = (iControl.NetworkingLLDPGlobalsBindingStub) new iControl.NetworkingLLDPGlobalsLocator().getNetworkingLLDPGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingLLDPGlobals); return m_NetworkingLLDPGlobals;}
public NetworkingMulticastRouteBindingStub getNetworkingMulticastRoute() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingMulticastRoute ) { m_NetworkingMulticastRoute = (iControl.NetworkingMulticastRouteBindingStub) new iControl.NetworkingMulticastRouteLocator().getNetworkingMulticastRoutePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingMulticastRoute); return m_NetworkingMulticastRoute;}
public NetworkingPacketFilterBindingStub getNetworkingPacketFilter() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingPacketFilter ) { m_NetworkingPacketFilter = (iControl.NetworkingPacketFilterBindingStub) new iControl.NetworkingPacketFilterLocator().getNetworkingPacketFilterPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingPacketFilter); return m_NetworkingPacketFilter;}
public NetworkingPacketFilterGlobalsBindingStub getNetworkingPacketFilterGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingPacketFilterGlobals ) { m_NetworkingPacketFilterGlobals = (iControl.NetworkingPacketFilterGlobalsBindingStub) new iControl.NetworkingPacketFilterGlobalsLocator().getNetworkingPacketFilterGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingPacketFilterGlobals); return m_NetworkingPacketFilterGlobals;}
public NetworkingPortMirrorBindingStub getNetworkingPortMirror() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingPortMirror ) { m_NetworkingPortMirror = (iControl.NetworkingPortMirrorBindingStub) new iControl.NetworkingPortMirrorLocator().getNetworkingPortMirrorPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingPortMirror); return m_NetworkingPortMirror;}
public NetworkingProfileFECBindingStub getNetworkingProfileFEC() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileFEC ) { m_NetworkingProfileFEC = (iControl.NetworkingProfileFECBindingStub) new iControl.NetworkingProfileFECLocator().getNetworkingProfileFECPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileFEC); return m_NetworkingProfileFEC;}
public NetworkingProfileGeneveBindingStub getNetworkingProfileGeneve() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileGeneve ) { m_NetworkingProfileGeneve = (iControl.NetworkingProfileGeneveBindingStub) new iControl.NetworkingProfileGeneveLocator().getNetworkingProfileGenevePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileGeneve); return m_NetworkingProfileGeneve;}
public NetworkingProfileGREBindingStub getNetworkingProfileGRE() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileGRE ) { m_NetworkingProfileGRE = (iControl.NetworkingProfileGREBindingStub) new iControl.NetworkingProfileGRELocator().getNetworkingProfileGREPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileGRE); return m_NetworkingProfileGRE;}
public NetworkingProfileIPIPBindingStub getNetworkingProfileIPIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileIPIP ) { m_NetworkingProfileIPIP = (iControl.NetworkingProfileIPIPBindingStub) new iControl.NetworkingProfileIPIPLocator().getNetworkingProfileIPIPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileIPIP); return m_NetworkingProfileIPIP;}
public NetworkingProfileIPsecBindingStub getNetworkingProfileIPsec() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileIPsec ) { m_NetworkingProfileIPsec = (iControl.NetworkingProfileIPsecBindingStub) new iControl.NetworkingProfileIPsecLocator().getNetworkingProfileIPsecPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileIPsec); return m_NetworkingProfileIPsec;}
public NetworkingProfileLightweight4Over6TunnelBindingStub getNetworkingProfileLightweight4Over6Tunnel() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileLightweight4Over6Tunnel ) { m_NetworkingProfileLightweight4Over6Tunnel = (iControl.NetworkingProfileLightweight4Over6TunnelBindingStub) new iControl.NetworkingProfileLightweight4Over6TunnelLocator().getNetworkingProfileLightweight4Over6TunnelPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileLightweight4Over6Tunnel); return m_NetworkingProfileLightweight4Over6Tunnel;}
public NetworkingProfileMAPBindingStub getNetworkingProfileMAP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileMAP ) { m_NetworkingProfileMAP = (iControl.NetworkingProfileMAPBindingStub) new iControl.NetworkingProfileMAPLocator().getNetworkingProfileMAPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileMAP); return m_NetworkingProfileMAP;}
public NetworkingProfileV6RDBindingStub getNetworkingProfileV6RD() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileV6RD ) { m_NetworkingProfileV6RD = (iControl.NetworkingProfileV6RDBindingStub) new iControl.NetworkingProfileV6RDLocator().getNetworkingProfileV6RDPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileV6RD); return m_NetworkingProfileV6RD;}
public NetworkingProfileVXLANBindingStub getNetworkingProfileVXLAN() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileVXLAN ) { m_NetworkingProfileVXLAN = (iControl.NetworkingProfileVXLANBindingStub) new iControl.NetworkingProfileVXLANLocator().getNetworkingProfileVXLANPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileVXLAN); return m_NetworkingProfileVXLAN;}
public NetworkingProfileWCCPGREBindingStub getNetworkingProfileWCCPGRE() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingProfileWCCPGRE ) { m_NetworkingProfileWCCPGRE = (iControl.NetworkingProfileWCCPGREBindingStub) new iControl.NetworkingProfileWCCPGRELocator().getNetworkingProfileWCCPGREPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingProfileWCCPGRE); return m_NetworkingProfileWCCPGRE;}
public NetworkingRouteDomainBindingStub getNetworkingRouteDomain() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouteDomain ) { m_NetworkingRouteDomain = (iControl.NetworkingRouteDomainBindingStub) new iControl.NetworkingRouteDomainLocator().getNetworkingRouteDomainPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouteDomain); return m_NetworkingRouteDomain;}
public NetworkingRouteDomainV2BindingStub getNetworkingRouteDomainV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouteDomainV2 ) { m_NetworkingRouteDomainV2 = (iControl.NetworkingRouteDomainV2BindingStub) new iControl.NetworkingRouteDomainV2Locator().getNetworkingRouteDomainV2Port(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouteDomainV2); return m_NetworkingRouteDomainV2;}
public NetworkingRouterAdvertisementBindingStub getNetworkingRouterAdvertisement() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouterAdvertisement ) { m_NetworkingRouterAdvertisement = (iControl.NetworkingRouterAdvertisementBindingStub) new iControl.NetworkingRouterAdvertisementLocator().getNetworkingRouterAdvertisementPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouterAdvertisement); return m_NetworkingRouterAdvertisement;}
public NetworkingRouteTableBindingStub getNetworkingRouteTable() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouteTable ) { m_NetworkingRouteTable = (iControl.NetworkingRouteTableBindingStub) new iControl.NetworkingRouteTableLocator().getNetworkingRouteTablePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouteTable); return m_NetworkingRouteTable;}
public NetworkingRouteTableV2BindingStub getNetworkingRouteTableV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingRouteTableV2 ) { m_NetworkingRouteTableV2 = (iControl.NetworkingRouteTableV2BindingStub) new iControl.NetworkingRouteTableV2Locator().getNetworkingRouteTableV2Port(new java.net.URL(buildURL())); } setupInterface(m_NetworkingRouteTableV2); return m_NetworkingRouteTableV2;}
public NetworkingSelfIPBindingStub getNetworkingSelfIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSelfIP ) { m_NetworkingSelfIP = (iControl.NetworkingSelfIPBindingStub) new iControl.NetworkingSelfIPLocator().getNetworkingSelfIPPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSelfIP); return m_NetworkingSelfIP;}
public NetworkingSelfIPPortLockdownBindingStub getNetworkingSelfIPPortLockdown() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSelfIPPortLockdown ) { m_NetworkingSelfIPPortLockdown = (iControl.NetworkingSelfIPPortLockdownBindingStub) new iControl.NetworkingSelfIPPortLockdownLocator().getNetworkingSelfIPPortLockdownPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSelfIPPortLockdown); return m_NetworkingSelfIPPortLockdown;}
public NetworkingSelfIPV2BindingStub getNetworkingSelfIPV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSelfIPV2 ) { m_NetworkingSelfIPV2 = (iControl.NetworkingSelfIPV2BindingStub) new iControl.NetworkingSelfIPV2Locator().getNetworkingSelfIPV2Port(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSelfIPV2); return m_NetworkingSelfIPV2;}
public NetworkingSTPGlobalsBindingStub getNetworkingSTPGlobals() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSTPGlobals ) { m_NetworkingSTPGlobals = (iControl.NetworkingSTPGlobalsBindingStub) new iControl.NetworkingSTPGlobalsLocator().getNetworkingSTPGlobalsPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSTPGlobals); return m_NetworkingSTPGlobals;}
public NetworkingSTPInstanceBindingStub getNetworkingSTPInstance() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSTPInstance ) { m_NetworkingSTPInstance = (iControl.NetworkingSTPInstanceBindingStub) new iControl.NetworkingSTPInstanceLocator().getNetworkingSTPInstancePort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSTPInstance); return m_NetworkingSTPInstance;}
public NetworkingSTPInstanceV2BindingStub getNetworkingSTPInstanceV2() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingSTPInstanceV2 ) { m_NetworkingSTPInstanceV2 = (iControl.NetworkingSTPInstanceV2BindingStub) new iControl.NetworkingSTPInstanceV2Locator().getNetworkingSTPInstanceV2Port(new java.net.URL(buildURL())); } setupInterface(m_NetworkingSTPInstanceV2); return m_NetworkingSTPInstanceV2;}
public NetworkingTrunkBindingStub getNetworkingTrunk() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingTrunk ) { m_NetworkingTrunk = (iControl.NetworkingTrunkBindingStub) new iControl.NetworkingTrunkLocator().getNetworkingTrunkPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingTrunk); return m_NetworkingTrunk;}
public NetworkingTunnelBindingStub getNetworkingTunnel() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingTunnel ) { m_NetworkingTunnel = (iControl.NetworkingTunnelBindingStub) new iControl.NetworkingTunnelLocator().getNetworkingTunnelPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingTunnel); return m_NetworkingTunnel;}
public NetworkingVLANBindingStub getNetworkingVLAN() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingVLAN ) { m_NetworkingVLAN = (iControl.NetworkingVLANBindingStub) new iControl.NetworkingVLANLocator().getNetworkingVLANPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingVLAN); return m_NetworkingVLAN;}
public NetworkingVLANGroupBindingStub getNetworkingVLANGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_NetworkingVLANGroup ) { m_NetworkingVLANGroup = (iControl.NetworkingVLANGroupBindingStub) new iControl.NetworkingVLANGroupLocator().getNetworkingVLANGroupPort(new java.net.URL(buildURL())); } setupInterface(m_NetworkingVLANGroup); return m_NetworkingVLANGroup;}
public PEMFormatScriptBindingStub getPEMFormatScript() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMFormatScript ) { m_PEMFormatScript = (iControl.PEMFormatScriptBindingStub) new iControl.PEMFormatScriptLocator().getPEMFormatScriptPort(new java.net.URL(buildURL())); } setupInterface(m_PEMFormatScript); return m_PEMFormatScript;}
public PEMForwardingEndpointBindingStub getPEMForwardingEndpoint() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMForwardingEndpoint ) { m_PEMForwardingEndpoint = (iControl.PEMForwardingEndpointBindingStub) new iControl.PEMForwardingEndpointLocator().getPEMForwardingEndpointPort(new java.net.URL(buildURL())); } setupInterface(m_PEMForwardingEndpoint); return m_PEMForwardingEndpoint;}
public PEMInterceptionEndpointBindingStub getPEMInterceptionEndpoint() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMInterceptionEndpoint ) { m_PEMInterceptionEndpoint = (iControl.PEMInterceptionEndpointBindingStub) new iControl.PEMInterceptionEndpointLocator().getPEMInterceptionEndpointPort(new java.net.URL(buildURL())); } setupInterface(m_PEMInterceptionEndpoint); return m_PEMInterceptionEndpoint;}
public PEMListenerBindingStub getPEMListener() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMListener ) { m_PEMListener = (iControl.PEMListenerBindingStub) new iControl.PEMListenerLocator().getPEMListenerPort(new java.net.URL(buildURL())); } setupInterface(m_PEMListener); return m_PEMListener;}
public PEMPolicyBindingStub getPEMPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMPolicy ) { m_PEMPolicy = (iControl.PEMPolicyBindingStub) new iControl.PEMPolicyLocator().getPEMPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_PEMPolicy); return m_PEMPolicy;}
public PEMServiceChainEndpointBindingStub getPEMServiceChainEndpoint() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMServiceChainEndpoint ) { m_PEMServiceChainEndpoint = (iControl.PEMServiceChainEndpointBindingStub) new iControl.PEMServiceChainEndpointLocator().getPEMServiceChainEndpointPort(new java.net.URL(buildURL())); } setupInterface(m_PEMServiceChainEndpoint); return m_PEMServiceChainEndpoint;}
public PEMSubscriberBindingStub getPEMSubscriber() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_PEMSubscriber ) { m_PEMSubscriber = (iControl.PEMSubscriberBindingStub) new iControl.PEMSubscriberLocator().getPEMSubscriberPort(new java.net.URL(buildURL())); } setupInterface(m_PEMSubscriber); return m_PEMSubscriber;}
public SecurityDoSDeviceBindingStub getSecurityDoSDevice() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityDoSDevice ) { m_SecurityDoSDevice = (iControl.SecurityDoSDeviceBindingStub) new iControl.SecurityDoSDeviceLocator().getSecurityDoSDevicePort(new java.net.URL(buildURL())); } setupInterface(m_SecurityDoSDevice); return m_SecurityDoSDevice;}
public SecurityDoSWhitelistBindingStub getSecurityDoSWhitelist() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityDoSWhitelist ) { m_SecurityDoSWhitelist = (iControl.SecurityDoSWhitelistBindingStub) new iControl.SecurityDoSWhitelistLocator().getSecurityDoSWhitelistPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityDoSWhitelist); return m_SecurityDoSWhitelist;}
public SecurityFirewallAddressListBindingStub getSecurityFirewallAddressList() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallAddressList ) { m_SecurityFirewallAddressList = (iControl.SecurityFirewallAddressListBindingStub) new iControl.SecurityFirewallAddressListLocator().getSecurityFirewallAddressListPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallAddressList); return m_SecurityFirewallAddressList;}
public SecurityFirewallGlobalAdminIPRuleListBindingStub getSecurityFirewallGlobalAdminIPRuleList() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallGlobalAdminIPRuleList ) { m_SecurityFirewallGlobalAdminIPRuleList = (iControl.SecurityFirewallGlobalAdminIPRuleListBindingStub) new iControl.SecurityFirewallGlobalAdminIPRuleListLocator().getSecurityFirewallGlobalAdminIPRuleListPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallGlobalAdminIPRuleList); return m_SecurityFirewallGlobalAdminIPRuleList;}
public SecurityFirewallGlobalRuleListBindingStub getSecurityFirewallGlobalRuleList() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallGlobalRuleList ) { m_SecurityFirewallGlobalRuleList = (iControl.SecurityFirewallGlobalRuleListBindingStub) new iControl.SecurityFirewallGlobalRuleListLocator().getSecurityFirewallGlobalRuleListPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallGlobalRuleList); return m_SecurityFirewallGlobalRuleList;}
public SecurityFirewallPolicyBindingStub getSecurityFirewallPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallPolicy ) { m_SecurityFirewallPolicy = (iControl.SecurityFirewallPolicyBindingStub) new iControl.SecurityFirewallPolicyLocator().getSecurityFirewallPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallPolicy); return m_SecurityFirewallPolicy;}
public SecurityFirewallPortListBindingStub getSecurityFirewallPortList() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallPortList ) { m_SecurityFirewallPortList = (iControl.SecurityFirewallPortListBindingStub) new iControl.SecurityFirewallPortListLocator().getSecurityFirewallPortListPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallPortList); return m_SecurityFirewallPortList;}
public SecurityFirewallRuleListBindingStub getSecurityFirewallRuleList() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallRuleList ) { m_SecurityFirewallRuleList = (iControl.SecurityFirewallRuleListBindingStub) new iControl.SecurityFirewallRuleListLocator().getSecurityFirewallRuleListPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallRuleList); return m_SecurityFirewallRuleList;}
public SecurityFirewallWeeklyScheduleBindingStub getSecurityFirewallWeeklySchedule() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityFirewallWeeklySchedule ) { m_SecurityFirewallWeeklySchedule = (iControl.SecurityFirewallWeeklyScheduleBindingStub) new iControl.SecurityFirewallWeeklyScheduleLocator().getSecurityFirewallWeeklySchedulePort(new java.net.URL(buildURL())); } setupInterface(m_SecurityFirewallWeeklySchedule); return m_SecurityFirewallWeeklySchedule;}
public SecurityIPIntelligenceBlacklistCategoryBindingStub getSecurityIPIntelligenceBlacklistCategory() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityIPIntelligenceBlacklistCategory ) { m_SecurityIPIntelligenceBlacklistCategory = (iControl.SecurityIPIntelligenceBlacklistCategoryBindingStub) new iControl.SecurityIPIntelligenceBlacklistCategoryLocator().getSecurityIPIntelligenceBlacklistCategoryPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityIPIntelligenceBlacklistCategory); return m_SecurityIPIntelligenceBlacklistCategory;}
public SecurityIPIntelligenceFeedListBindingStub getSecurityIPIntelligenceFeedList() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityIPIntelligenceFeedList ) { m_SecurityIPIntelligenceFeedList = (iControl.SecurityIPIntelligenceFeedListBindingStub) new iControl.SecurityIPIntelligenceFeedListLocator().getSecurityIPIntelligenceFeedListPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityIPIntelligenceFeedList); return m_SecurityIPIntelligenceFeedList;}
public SecurityIPIntelligenceGlobalPolicyBindingStub getSecurityIPIntelligenceGlobalPolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityIPIntelligenceGlobalPolicy ) { m_SecurityIPIntelligenceGlobalPolicy = (iControl.SecurityIPIntelligenceGlobalPolicyBindingStub) new iControl.SecurityIPIntelligenceGlobalPolicyLocator().getSecurityIPIntelligenceGlobalPolicyPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityIPIntelligenceGlobalPolicy); return m_SecurityIPIntelligenceGlobalPolicy;}
public SecurityIPIntelligencePolicyBindingStub getSecurityIPIntelligencePolicy() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityIPIntelligencePolicy ) { m_SecurityIPIntelligencePolicy = (iControl.SecurityIPIntelligencePolicyBindingStub) new iControl.SecurityIPIntelligencePolicyLocator().getSecurityIPIntelligencePolicyPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityIPIntelligencePolicy); return m_SecurityIPIntelligencePolicy;}
public SecurityLogProfileBindingStub getSecurityLogProfile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityLogProfile ) { m_SecurityLogProfile = (iControl.SecurityLogProfileBindingStub) new iControl.SecurityLogProfileLocator().getSecurityLogProfilePort(new java.net.URL(buildURL())); } setupInterface(m_SecurityLogProfile); return m_SecurityLogProfile;}
public SecurityProfileDNSSecurityBindingStub getSecurityProfileDNSSecurity() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityProfileDNSSecurity ) { m_SecurityProfileDNSSecurity = (iControl.SecurityProfileDNSSecurityBindingStub) new iControl.SecurityProfileDNSSecurityLocator().getSecurityProfileDNSSecurityPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityProfileDNSSecurity); return m_SecurityProfileDNSSecurity;}
public SecurityProfileDoSBindingStub getSecurityProfileDoS() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityProfileDoS ) { m_SecurityProfileDoS = (iControl.SecurityProfileDoSBindingStub) new iControl.SecurityProfileDoSLocator().getSecurityProfileDoSPort(new java.net.URL(buildURL())); } setupInterface(m_SecurityProfileDoS); return m_SecurityProfileDoS;}
public SecurityProfileIPIntelligenceBindingStub getSecurityProfileIPIntelligence() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SecurityProfileIPIntelligence ) { m_SecurityProfileIPIntelligence = (iControl.SecurityProfileIPIntelligenceBindingStub) new iControl.SecurityProfileIPIntelligenceLocator().getSecurityProfileIPIntelligencePort(new java.net.URL(buildURL())); } setupInterface(m_SecurityProfileIPIntelligence); return m_SecurityProfileIPIntelligence;}
public SystemCertificateRevocationListFileBindingStub getSystemCertificateRevocationListFile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemCertificateRevocationListFile ) { m_SystemCertificateRevocationListFile = (iControl.SystemCertificateRevocationListFileBindingStub) new iControl.SystemCertificateRevocationListFileLocator().getSystemCertificateRevocationListFilePort(new java.net.URL(buildURL())); } setupInterface(m_SystemCertificateRevocationListFile); return m_SystemCertificateRevocationListFile;}
public SystemClusterBindingStub getSystemCluster() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemCluster ) { m_SystemCluster = (iControl.SystemClusterBindingStub) new iControl.SystemClusterLocator().getSystemClusterPort(new java.net.URL(buildURL())); } setupInterface(m_SystemCluster); return m_SystemCluster;}
public SystemConfigSyncBindingStub getSystemConfigSync() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemConfigSync ) { m_SystemConfigSync = (iControl.SystemConfigSyncBindingStub) new iControl.SystemConfigSyncLocator().getSystemConfigSyncPort(new java.net.URL(buildURL())); } setupInterface(m_SystemConfigSync); return m_SystemConfigSync;}
public SystemCryptoClientBindingStub getSystemCryptoClient() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemCryptoClient ) { m_SystemCryptoClient = (iControl.SystemCryptoClientBindingStub) new iControl.SystemCryptoClientLocator().getSystemCryptoClientPort(new java.net.URL(buildURL())); } setupInterface(m_SystemCryptoClient); return m_SystemCryptoClient;}
public SystemCryptoServerBindingStub getSystemCryptoServer() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemCryptoServer ) { m_SystemCryptoServer = (iControl.SystemCryptoServerBindingStub) new iControl.SystemCryptoServerLocator().getSystemCryptoServerPort(new java.net.URL(buildURL())); } setupInterface(m_SystemCryptoServer); return m_SystemCryptoServer;}
public SystemDiskBindingStub getSystemDisk() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemDisk ) { m_SystemDisk = (iControl.SystemDiskBindingStub) new iControl.SystemDiskLocator().getSystemDiskPort(new java.net.URL(buildURL())); } setupInterface(m_SystemDisk); return m_SystemDisk;}
public SystemExternalMonitorFileBindingStub getSystemExternalMonitorFile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemExternalMonitorFile ) { m_SystemExternalMonitorFile = (iControl.SystemExternalMonitorFileBindingStub) new iControl.SystemExternalMonitorFileLocator().getSystemExternalMonitorFilePort(new java.net.URL(buildURL())); } setupInterface(m_SystemExternalMonitorFile); return m_SystemExternalMonitorFile;}
public SystemFailoverBindingStub getSystemFailover() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemFailover ) { m_SystemFailover = (iControl.SystemFailoverBindingStub) new iControl.SystemFailoverLocator().getSystemFailoverPort(new java.net.URL(buildURL())); } setupInterface(m_SystemFailover); return m_SystemFailover;}
public SystemGeoIPBindingStub getSystemGeoIP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemGeoIP ) { m_SystemGeoIP = (iControl.SystemGeoIPBindingStub) new iControl.SystemGeoIPLocator().getSystemGeoIPPort(new java.net.URL(buildURL())); } setupInterface(m_SystemGeoIP); return m_SystemGeoIP;}
public SystemHAGroupBindingStub getSystemHAGroup() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemHAGroup ) { m_SystemHAGroup = (iControl.SystemHAGroupBindingStub) new iControl.SystemHAGroupLocator().getSystemHAGroupPort(new java.net.URL(buildURL())); } setupInterface(m_SystemHAGroup); return m_SystemHAGroup;}
public SystemHAStatusBindingStub getSystemHAStatus() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemHAStatus ) { m_SystemHAStatus = (iControl.SystemHAStatusBindingStub) new iControl.SystemHAStatusLocator().getSystemHAStatusPort(new java.net.URL(buildURL())); } setupInterface(m_SystemHAStatus); return m_SystemHAStatus;}
public SystemInetBindingStub getSystemInet() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemInet ) { m_SystemInet = (iControl.SystemInetBindingStub) new iControl.SystemInetLocator().getSystemInetPort(new java.net.URL(buildURL())); } setupInterface(m_SystemInet); return m_SystemInet;}
public SystemLightweightTunnelTableFileBindingStub getSystemLightweightTunnelTableFile() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemLightweightTunnelTableFile ) { m_SystemLightweightTunnelTableFile = (iControl.SystemLightweightTunnelTableFileBindingStub) new iControl.SystemLightweightTunnelTableFileLocator().getSystemLightweightTunnelTableFilePort(new java.net.URL(buildURL())); } setupInterface(m_SystemLightweightTunnelTableFile); return m_SystemLightweightTunnelTableFile;}
public SystemPerformanceSFlowBindingStub getSystemPerformanceSFlow() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemPerformanceSFlow ) { m_SystemPerformanceSFlow = (iControl.SystemPerformanceSFlowBindingStub) new iControl.SystemPerformanceSFlowLocator().getSystemPerformanceSFlowPort(new java.net.URL(buildURL())); } setupInterface(m_SystemPerformanceSFlow); return m_SystemPerformanceSFlow;}
public SystemServicesBindingStub getSystemServices() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemServices ) { m_SystemServices = (iControl.SystemServicesBindingStub) new iControl.SystemServicesLocator().getSystemServicesPort(new java.net.URL(buildURL())); } setupInterface(m_SystemServices); return m_SystemServices;}
public SystemSessionBindingStub getSystemSession() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemSession ) { m_SystemSession = (iControl.SystemSessionBindingStub) new iControl.SystemSessionLocator().getSystemSessionPort(new java.net.URL(buildURL())); } setupInterface(m_SystemSession); return m_SystemSession;}
public SystemSoftwareManagementBindingStub getSystemSoftwareManagement() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemSoftwareManagement ) { m_SystemSoftwareManagement = (iControl.SystemSoftwareManagementBindingStub) new iControl.SystemSoftwareManagementLocator().getSystemSoftwareManagementPort(new java.net.URL(buildURL())); } setupInterface(m_SystemSoftwareManagement); return m_SystemSoftwareManagement;}
public SystemStatisticsBindingStub getSystemStatistics() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemStatistics ) { m_SystemStatistics = (iControl.SystemStatisticsBindingStub) new iControl.SystemStatisticsLocator().getSystemStatisticsPort(new java.net.URL(buildURL())); } setupInterface(m_SystemStatistics); return m_SystemStatistics;}
public SystemSystemInfoBindingStub getSystemSystemInfo() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemSystemInfo ) { m_SystemSystemInfo = (iControl.SystemSystemInfoBindingStub) new iControl.SystemSystemInfoLocator().getSystemSystemInfoPort(new java.net.URL(buildURL())); } setupInterface(m_SystemSystemInfo); return m_SystemSystemInfo;}
public SystemVCMPBindingStub getSystemVCMP() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_SystemVCMP ) { m_SystemVCMP = (iControl.SystemVCMPBindingStub) new iControl.SystemVCMPLocator().getSystemVCMPPort(new java.net.URL(buildURL())); } setupInterface(m_SystemVCMP); return m_SystemVCMP;}
public WebAcceleratorApplicationsBindingStub getWebAcceleratorApplications() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_WebAcceleratorApplications ) { m_WebAcceleratorApplications = (iControl.WebAcceleratorApplicationsBindingStub) new iControl.WebAcceleratorApplicationsLocator().getWebAcceleratorApplicationsPort(new java.net.URL(buildURL())); } setupInterface(m_WebAcceleratorApplications); return m_WebAcceleratorApplications;}
public WebAcceleratorPoliciesBindingStub getWebAcceleratorPolicies() throws Exception { if (!m_bInitialized ) { throw new IllegalStateException("Not Initialized"); } if (null == m_WebAcceleratorPolicies ) { m_WebAcceleratorPolicies = (iControl.WebAcceleratorPoliciesBindingStub) new iControl.WebAcceleratorPoliciesLocator().getWebAcceleratorPoliciesPort(new java.net.URL(buildURL())); } setupInterface(m_WebAcceleratorPolicies); return m_WebAcceleratorPolicies;}


	//-------------------------------------------------------------------
	// Constructor
	//-------------------------------------------------------------------
	public Interfaces()
	{
		System.setProperty("javax.net.ssl.trustStore", System.getProperty("user.home") + "/.keystore");
		XTrustProvider.install();
	}
	
	public Interfaces(String hostname, String username, String password)
	{
		System.setProperty("javax.net.ssl.trustStore", System.getProperty("user.home") + "/.keystore");
		XTrustProvider.install();
		initialize(hostname, username, password);
	}
	
	public Interfaces(String hostname, long port, String username, String password)
	{
		System.setProperty("javax.net.ssl.trustStore", System.getProperty("user.home") + "/.keystore");
		XTrustProvider.install();
		initialize(hostname, port, username, password);
	}
	
	//-------------------------------------------------------------------
	// private methods
	//-------------------------------------------------------------------

	private String buildURL()
	{
		String url = "http";
		if ( 443 == m_port )
		{
			url = url + "s";
		}
		//url = url + "://" + m_username + ":" + m_password + "@" + m_hostname + ":" + m_port + "/iControl/iControlPortal.cgi";
		url = url + "://" + m_hostname + ":" + m_port + "/iControl/iControlPortal.cgi";
		
		return url;
	}
	
	
	//-------------------------------------------------------------------
	// public methods
	//-------------------------------------------------------------------

	public Boolean initialize(String hostname, String username, String password)
	{
		return initialize(hostname, 443, username, password);
	}
	
	public Boolean initialize(String hostname, long port, String username, String password)
	{
		m_bInitialized = false;

		m_hostname = hostname;
		m_port = port;
		m_username = username;
		m_password = password;

m_ASMLoggingProfile = null;
m_ASMPolicy = null;
m_ASMPolicyGroup = null;
m_ASMSystemConfiguration = null;
m_ASMWebApplication = null;
m_ASMWebApplicationGroup = null;
m_ClassificationApplication = null;
m_ClassificationCategory = null;
m_ClassificationSignatureDefinition = null;
m_ClassificationSignatureUpdateSchedule = null;
m_ClassificationSignatureVersion = null;
m_GlobalLBApplication = null;
m_GlobalLBDataCenter = null;
m_GlobalLBDNSSECKey = null;
m_GlobalLBDNSSECZone = null;
m_GlobalLBGlobals = null;
m_GlobalLBLink = null;
m_GlobalLBMonitor = null;
m_GlobalLBPool = null;
m_GlobalLBPoolMember = null;
m_GlobalLBPoolV2 = null;
m_GlobalLBProberPool = null;
m_GlobalLBRegion = null;
m_GlobalLBRule = null;
m_GlobalLBServer = null;
m_GlobalLBTopology = null;
m_GlobalLBVirtualServer = null;
m_GlobalLBVirtualServerV2 = null;
m_GlobalLBWideIP = null;
m_GlobalLBWideIPV2 = null;
m_iCallPeriodicHandler = null;
m_iCallPerpetualHandler = null;
m_iCallScript = null;
m_iCallTriggeredHandler = null;
m_LocalLBALGLogProfile = null;
m_LocalLBClass = null;
m_LocalLBContentPolicy = null;
m_LocalLBContentPolicyStrategy = null;
m_LocalLBDataGroupFile = null;
m_LocalLBDNSCache = null;
m_LocalLBDNSExpress = null;
m_LocalLBDNSGlobals = null;
m_LocalLBDNSServer = null;
m_LocalLBDNSTSIGKey = null;
m_LocalLBDNSZone = null;
m_LocalLBFlowEvictionPolicy = null;
m_LocalLBiFile = null;
m_LocalLBiFileFile = null;
m_LocalLBLSNLogProfile = null;
m_LocalLBLSNPool = null;
m_LocalLBMessageRoutingPeer = null;
m_LocalLBMessageRoutingSIPRoute = null;
m_LocalLBMessageRoutingTransportConfig = null;
m_LocalLBMonitor = null;
m_LocalLBNAT = null;
m_LocalLBNATV2 = null;
m_LocalLBNodeAddress = null;
m_LocalLBNodeAddressV2 = null;
m_LocalLBOCSPStaplingParameters = null;
m_LocalLBPool = null;
m_LocalLBPoolMember = null;
m_LocalLBProfileAnalytics = null;
m_LocalLBProfileAuth = null;
m_LocalLBProfileClassification = null;
m_LocalLBProfileClientLDAP = null;
m_LocalLBProfileClientSSL = null;
m_LocalLBProfileDiameter = null;
m_LocalLBProfileDiameterEndpoint = null;
m_LocalLBProfileDNS = null;
m_LocalLBProfileDNSLogging = null;
m_LocalLBProfileFastHttp = null;
m_LocalLBProfileFastL4 = null;
m_LocalLBProfileFIX = null;
m_LocalLBProfileFTP = null;
m_LocalLBProfileHttp = null;
m_LocalLBProfileHttpClass = null;
m_LocalLBProfileHttpCompression = null;
m_LocalLBProfileICAP = null;
m_LocalLBProfileIIOP = null;
m_LocalLBProfileOneConnect = null;
m_LocalLBProfilePCP = null;
m_LocalLBProfilePersistence = null;
m_LocalLBProfilePPTP = null;
m_LocalLBProfileRADIUS = null;
m_LocalLBProfileRequestAdapt = null;
m_LocalLBProfileRequestLogging = null;
m_LocalLBProfileResponseAdapt = null;
m_LocalLBProfileRTSP = null;
m_LocalLBProfileSCTP = null;
m_LocalLBProfileServerLDAP = null;
m_LocalLBProfileServerSSL = null;
m_LocalLBProfileSIP = null;
m_LocalLBProfileSIPRouter = null;
m_LocalLBProfileSIPSession = null;
m_LocalLBProfileSMTPS = null;
m_LocalLBProfileSPDY = null;
m_LocalLBProfileSPM = null;
m_LocalLBProfileStream = null;
m_LocalLBProfileTCP = null;
m_LocalLBProfileTCPAnalytics = null;
m_LocalLBProfileTFTP = null;
m_LocalLBProfileUDP = null;
m_LocalLBProfileUserStatistic = null;
m_LocalLBProfileWebAcceleration = null;
m_LocalLBProfileXML = null;
m_LocalLBRAMCacheInformation = null;
m_LocalLBRateClass = null;
m_LocalLBRule = null;
m_LocalLBSNAT = null;
m_LocalLBSNATPool = null;
m_LocalLBSNATPoolMember = null;
m_LocalLBSNATTranslationAddress = null;
m_LocalLBSNATTranslationAddressV2 = null;
m_LocalLBVirtualAddress = null;
m_LocalLBVirtualAddressV2 = null;
m_LocalLBVirtualServer = null;
m_LogDestinationArcSight = null;
m_LogDestinationIPFIX = null;
m_LogDestinationLocalSyslog = null;
m_LogDestinationManagementPort = null;
m_LogDestinationRemoteHighSpeedLog = null;
m_LogDestinationRemoteSyslog = null;
m_LogDestinationSplunk = null;
m_LogFilter = null;
m_LogIPFIXInformationElement = null;
m_LogPublisher = null;
m_LTConfigClass = null;
m_LTConfigField = null;
m_ManagementApplicationPresentationScript = null;
m_ManagementApplicationService = null;
m_ManagementApplicationTemplate = null;
m_ManagementCCLDAPConfiguration = null;
m_ManagementCertLDAPConfiguration = null;
m_ManagementCLIScript = null;
m_ManagementCRLDPConfiguration = null;
m_ManagementCRLDPServer = null;
m_ManagementDBVariable = null;
m_ManagementDevice = null;
m_ManagementDeviceGroup = null;
m_ManagementEM = null;
m_ManagementEventNotification = null;
m_ManagementEventSubscription = null;
m_ManagementFeatureModule = null;
m_ManagementFolder = null;
m_ManagementGlobals = null;
m_ManagementKeyCertificate = null;
m_ManagementLDAPConfiguration = null;
m_ManagementLicenseAdministration = null;
m_ManagementNamed = null;
m_ManagementOCSPConfiguration = null;
m_ManagementOCSPResponder = null;
m_ManagementPartition = null;
m_ManagementProvision = null;
m_ManagementRADIUSConfiguration = null;
m_ManagementRADIUSServer = null;
m_ManagementResourceRecord = null;
m_ManagementSFlowDataSource = null;
m_ManagementSFlowGlobals = null;
m_ManagementSFlowReceiver = null;
m_ManagementSMTPConfiguration = null;
m_ManagementSNMPConfiguration = null;
m_ManagementTACACSConfiguration = null;
m_ManagementTMOSModule = null;
m_ManagementTrafficGroup = null;
m_ManagementTrust = null;
m_ManagementUserManagement = null;
m_ManagementView = null;
m_ManagementZone = null;
m_ManagementZoneRunner = null;
m_NetworkingAdminIP = null;
m_NetworkingARP = null;
m_NetworkingBWControllerPolicy = null;
m_NetworkingBWPriorityGroup = null;
m_NetworkingDNSResolver = null;
m_NetworkingInterfaces = null;
m_NetworkingIPsecIkeDaemon = null;
m_NetworkingIPsecIkePeer = null;
m_NetworkingIPsecManualSecurityAssociation = null;
m_NetworkingIPsecPolicy = null;
m_NetworkingIPsecTrafficSelector = null;
m_NetworkingiSessionAdvertisedRoute = null;
m_NetworkingiSessionAdvertisedRouteV2 = null;
m_NetworkingiSessionDatastor = null;
m_NetworkingiSessionDeduplication = null;
m_NetworkingiSessionLocalInterface = null;
m_NetworkingiSessionPeerDiscovery = null;
m_NetworkingiSessionRemoteInterface = null;
m_NetworkingiSessionRemoteInterfaceV2 = null;
m_NetworkingLLDPGlobals = null;
m_NetworkingMulticastRoute = null;
m_NetworkingPacketFilter = null;
m_NetworkingPacketFilterGlobals = null;
m_NetworkingPortMirror = null;
m_NetworkingProfileFEC = null;
m_NetworkingProfileGeneve = null;
m_NetworkingProfileGRE = null;
m_NetworkingProfileIPIP = null;
m_NetworkingProfileIPsec = null;
m_NetworkingProfileLightweight4Over6Tunnel = null;
m_NetworkingProfileMAP = null;
m_NetworkingProfileV6RD = null;
m_NetworkingProfileVXLAN = null;
m_NetworkingProfileWCCPGRE = null;
m_NetworkingRouteDomain = null;
m_NetworkingRouteDomainV2 = null;
m_NetworkingRouterAdvertisement = null;
m_NetworkingRouteTable = null;
m_NetworkingRouteTableV2 = null;
m_NetworkingSelfIP = null;
m_NetworkingSelfIPPortLockdown = null;
m_NetworkingSelfIPV2 = null;
m_NetworkingSTPGlobals = null;
m_NetworkingSTPInstance = null;
m_NetworkingSTPInstanceV2 = null;
m_NetworkingTrunk = null;
m_NetworkingTunnel = null;
m_NetworkingVLAN = null;
m_NetworkingVLANGroup = null;
m_PEMFormatScript = null;
m_PEMForwardingEndpoint = null;
m_PEMInterceptionEndpoint = null;
m_PEMListener = null;
m_PEMPolicy = null;
m_PEMServiceChainEndpoint = null;
m_PEMSubscriber = null;
m_SecurityDoSDevice = null;
m_SecurityDoSWhitelist = null;
m_SecurityFirewallAddressList = null;
m_SecurityFirewallGlobalAdminIPRuleList = null;
m_SecurityFirewallGlobalRuleList = null;
m_SecurityFirewallPolicy = null;
m_SecurityFirewallPortList = null;
m_SecurityFirewallRuleList = null;
m_SecurityFirewallWeeklySchedule = null;
m_SecurityIPIntelligenceBlacklistCategory = null;
m_SecurityIPIntelligenceFeedList = null;
m_SecurityIPIntelligenceGlobalPolicy = null;
m_SecurityIPIntelligencePolicy = null;
m_SecurityLogProfile = null;
m_SecurityProfileDNSSecurity = null;
m_SecurityProfileDoS = null;
m_SecurityProfileIPIntelligence = null;
m_SystemCertificateRevocationListFile = null;
m_SystemCluster = null;
m_SystemConfigSync = null;
m_SystemCryptoClient = null;
m_SystemCryptoServer = null;
m_SystemDisk = null;
m_SystemExternalMonitorFile = null;
m_SystemFailover = null;
m_SystemGeoIP = null;
m_SystemHAGroup = null;
m_SystemHAStatus = null;
m_SystemInet = null;
m_SystemLightweightTunnelTableFile = null;
m_SystemPerformanceSFlow = null;
m_SystemServices = null;
m_SystemSession = null;
m_SystemSoftwareManagement = null;
m_SystemStatistics = null;
m_SystemSystemInfo = null;
m_SystemVCMP = null;
m_WebAcceleratorApplications = null;
m_WebAcceleratorPolicies = null;

		m_bInitialized = true;
		
		return m_bInitialized;
	}
};