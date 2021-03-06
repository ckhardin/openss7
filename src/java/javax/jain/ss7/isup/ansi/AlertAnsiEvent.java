/*
 @(#) src/java/javax/jain/ss7/isup/ansi/AlertAnsiEvent.java <p>
 
 Copyright &copy; 2008-2015  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a>
 */

package javax.jain.ss7.isup.ansi;

import javax.jain.ss7.isup.*;
import javax.jain.ss7.*;
import javax.jain.*;

/** An ISUP Event: The AlertAnsiEvent class is a subclass of the JAIN ISUP core
  * AlertEvent class and is used for handling of parameters for the ANSI variant of
  * Address Complete Message.
  *
  * @author Monavacon Limited
  * @version 1.2.2
  */
public class AlertAnsiEvent extends AlertEvent {
    /** Constructs a new AlertEvent for ANSI variant, with only the JAIN ISUP Mandatory
      * parameters using the super class constructor.
      * @param source The source of the event.
      * @param dpc The destination point code.
      * @param opc The origination point code.
      * @param sls The signaling link selection.
      * @param cic The CIC on which the cal lhas been established.
      * @param congestionPriority Priority of the ISUP message that may be used in the
      * optional national congestion control procedures of MTP.  Refer to
      * getCongestionPriority method in IsupEvent calss for details.
      * @param bci Backward call indicators.
      * @exception ParameterRangeInvalidException  Thrown when a value is out of range.  */
    public AlertAnsiEvent(java.lang.Object source, SignalingPointCode dpc, SignalingPointCode opc, byte sls, int cic, byte congestionPriority, BwdCallIndAnsi bci)
        throws ParameterRangeInvalidException {
        super(source, dpc, opc, sls, cic, congestionPriority, bci);
    }
    /** Gets the BusinessGroupAnsi parameter of the message.
      * @return The Business Group parameter of the event.
      * @exception ParameterNotSetException Thrown when the parameter is not set in the
      * event.  */
    public BusinessGroupAnsi getBusinessGroup() throws ParameterNotSetException {
        if (m_bgp != null)
            return m_bgp;
        throw new ParameterNotSetException("Business Group parameter not set.");
    }
    /** Sets the Business Group parameter of the message.
      * @param bgp The Business Group parameter of the event.  */
    public void setBusinessGroup(BusinessGroupAnsi bgp) {
        m_bgp = bgp;
    }
    /** Indicates if the Business Group parameter is present in this Event.
      * @return True if present, false otherwise.  */
    public boolean isBusinessGroupPresent() {
        if (m_bgp != null)
            return true;
        return false;
    }
    /** Gets  the ConReq parameters of rht message.
      * @exception ParameterNotSetException Thrown when the parameter is not set in the
      * event.  */
    public ConReq getConReq() throws ParameterNotSetException {
        if (m_crp != null)
            return m_crp;
        throw new ParameterNotSetException("Connection Request parameter not set.");
    }
    /** Sets the Connection Request parameter of the message.  */
    public void setConReq(ConReq connectionReq) {
        m_crp = connectionReq;
    }
    /** Indicates if the Connection Request parameter is present in this Event.
      * @return True if present, false otherwise.  */
    public boolean isConReqPresent() {
        return (m_crp != null);
    }
    /** Gets the InformationIndicators parameter of the message.
      * @exception ParameterNotSetException Thrown when the parameter is not set in the
      * event.  */
    public InfoInd getInfoInd() throws ParameterNotSetException {
        if (m_iip != null)
            return m_iip;
        throw new ParameterNotSetException("Information Indicators parameter not set.");
    }
    /** Sets the Information Indicators parameter of the message.  */
    public void setInfoInd(InfoIndAnsi ini) {
        m_iip = ini;
    }
    /** Indicates if the Information Indicators parameter is present in this Event.
      * @return True if present, false otherwise.  */
    public boolean isInfoIndPresent() {
        return (m_iip != null);
    }
    /** Gets the Network Transport parameter of the message.
      * @exception ParameterNotSetException Thrown when the parameter is not set in the
      * event.  */
    public byte[] getNetworkTransport() throws ParameterNotSetException  {
        if (m_ntp != null)
            return m_ntp;
        throw new ParameterNotSetException("Network Transport parameter not set.");
    }
    /** Sets the Network Transport parameter of the message.  */
    public void setNetworkTransport(byte[] ntp) {
        m_ntp = ntp;
    }
    /** Indicates if the Network Transport parameter is present in this Event.
      * @exception ParameterNotSetException Thrown when the parameter is not set in the
      * event.
      * @return True if present, false otherwise.  */
    public boolean isNetworkTransportPresent() {
        return (m_ntp != null);
    }
    /** Gets the Redirection info parameter of the message.
      * @exception ParameterNotSetException Thrown when the parameter is not set in the
      * event.  */
    public RedirectionInfo getRedirectionInfo() throws ParameterNotSetException {
        if (m_rip != null)
            return m_rip;
        throw new ParameterNotSetException("Redirection Information parameter not set.");
    }
    /** Sets the Redirection Information prameter of the message.  */
    public void setRedirectionInfo(RedirectionInfo ri) {
        m_rip = ri;
    }
    /** Indicates if the Redirection Information parameter is present in this Event.
      * @return True if present, false otherwise.  */
    public boolean isRedirectionInfoPresent() {
        return (m_rip != null);
    }
    /** The toString method retrieves a string containing the values of the members of
      * the class.  */
    public java.lang.String toString() {
        StringBuffer buffer = new StringBuffer(500);
        buffer.append(super.toString());
        buffer.append("\nAlertAnsiEvent:");
        buffer.append("\n\tBusiness Group: " + m_bgp);
        buffer.append("\n\tConnection Request: " + m_crp);
        buffer.append("\n\tInformation Indicators Request: " + m_iip);
        buffer.append("\n\tNetwork Transport:" + m_ntp);
        buffer.append("\n\tRedirection Information:" + m_rip);
        return buffer.toString();
    }
    private BusinessGroupAnsi m_bgp = null;
    private ConReq m_crp = null;
    private InfoInd m_iip = null;
    private byte[] m_ntp = null;
    private RedirectionInfo m_rip = null;
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
