/*
 @(#) src/java/javax/jain/ss7/inap/datatype/AddressAndService.java <p>
 
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

package javax.jain.ss7.inap.datatype;

import javax.jain.ss7.inap.constants.*;
import javax.jain.ss7.inap.*;
import javax.jain.ss7.*;
import javax.jain.*;

/**
  * This class represents the AddressAndService DataType.
  * @version 1.2.2
  * @author Monavacon Limited
  */
public class AddressAndService extends java.lang.Object implements java.io.Serializable {
    /** Constructor For AddressAndService.  */
    public AddressAndService(DigitsGenericNumber calledAddressValue, int serviceKey) {
        setCalledAddressValue(calledAddressValue);
        setServiceKey(serviceKey);
    }
    /** Gets Called Address Value.  */
    public DigitsGenericNumber getCalledAddressValue() {
        return calledAddressValue;
    }
    /** Sets Called Address Value.  */
    public void setCalledAddressValue(DigitsGenericNumber calledAddressValue) {
        this.calledAddressValue = calledAddressValue;
    }
    /** Gets Service Key.  */
    public int getServiceKey() {
        return serviceKey;
    }
    /** Sets Service Key.  */
    public void setServiceKey(int serviceKey) {
        this.serviceKey = serviceKey;
    }
    /** Gets Calling Address Value.  */
    public DigitsGenericNumber getCallingAddressValue()
        throws ParameterNotSetException {
        if (isCallingAddressValuePresent())
            return callingAddressValue;
        throw new ParameterNotSetException("Calling Address Value: not set.");
    }
    /** Sets Calling Address Value.  */
    public void setCallingAddressValue(DigitsGenericNumber callingAddressValue) {
        this.callingAddressValue = callingAddressValue;
        this.callingAddressValuePresent = true;
    }
    /** Indicates if the Calling Address Value optional parameter is present.
      * @return
      * True if present, false otherwise.  */
    public boolean isCallingAddressValuePresent() {
        return callingAddressValuePresent;
    }
    /** Gets Location Number.  */
    public LocationNumber getLocationNumber()
        throws ParameterNotSetException {
        if (isLocationNumberPresent())
            return locationNumber;
        throw new ParameterNotSetException("Location Number: not set.");
    }
    /** Sets Location Number.  */
    public void setLocationNumber(LocationNumber locationNumber) {
        this.locationNumber = locationNumber;
        this.locationNumberPresent = true;
    }
    /** Indicates if the Location Number optional parameter is present.
      * @return
      * True if present, false otherwise.  */
    public boolean isLocationNumberPresent() {
        return locationNumberPresent;
    }
    private DigitsGenericNumber calledAddressValue;
    private int serviceKey;
    private DigitsGenericNumber callingAddressValue;
    private boolean callingAddressValuePresent = false;
    private LocationNumber locationNumber;
    private boolean locationNumberPresent = false;
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
