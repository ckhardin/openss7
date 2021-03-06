// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
/*
 @(#) src/java/jain/protocol/ip/mgcp/JainMgcpCommandEvent.java <p>
 
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

package jain.protocol.ip.mgcp;

/**
    The base class for all JAIN MGCP Command Events.
    @version 1.2.2
    @author Monavacon Limited
  */
public abstract class JainMgcpCommandEvent extends JainMgcpEvent {
    /**
        Constructs a Command Event object.
        @param source A reference to the object, the "source", that is logically deemed to be the
        object upon which the Event in question initially occurred.
        @param endpointIdentifier The endpoint identifier for which this command is being issued.
      */
    public JainMgcpCommandEvent(java.lang.Object source, EndpointIdentifier endpointIdentifier,
            int objectIdentifier)
        throws java.lang.IllegalArgumentException {
        super(source, objectIdentifier);
        m_endpointIdentifier = endpointIdentifier;
    }
    /**
        Builds a canonical command header line for an MGCP command message. The transaction
        identifier and the endpoint identifier are data members of the object that invokes this
        method. Note: this is a protected method intended for use only by subclasses of this class
        that represent MGCP command primitives.
        @param cmd The command verb to be used in building the command header line.
        @return A canonically-formatted command header line.
      */
    protected java.lang.String BuildCommandHeader(java.lang.String cmd) {
        return null;
    }
    /**
        Gets the Endpoint Identifier.
        @return The Endpoint Identifier.
      */
    public EndpointIdentifier getEndpointIdentifier() {
        return m_endpointIdentifier;
    }
    /**
        Sets the Endpoint Identifier.
        @param endpointIdentifier Name for the endpoint in the gateway where this command executes.
      */
    public void setEndpointIdentifier(EndpointIdentifier endpointIdentifier)
        throws java.lang.IllegalArgumentException {
        m_endpointIdentifier = endpointIdentifier;
    }
    private EndpointIdentifier m_endpointIdentifier;
}

