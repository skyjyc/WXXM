package com.wxxm.MashallerService;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.Duration;
import com.cfar.swim.wxxm.bind.WxxmMarshaller;
import com.wxxm.bean.*;
import aero.aixm.*;
import aero.wxxm.AIRMETReportStatusType;
import aero.wxxm.AIRMETType;
import aero.wxxm.AeronauticalAreaWeatherPhenomenonType;
import aero.wxxm.UnitPropertyType;
import net.opengis.gml.LengthType;
import net.opengis.gml.ReferenceType;
import net.opengis.gml.SpeedType;
import net.opengis.gml.TimeIndeterminateValueType;
import net.opengis.gml.TimeInstantPropertyType;
import net.opengis.gml.TimeInstantType;
import net.opengis.gml.TimeIntervalLengthType;
import net.opengis.gml.TimePeriodPropertyType;
import net.opengis.gml.TimePeriodType;
import net.opengis.gml.TimePositionType;
import net.opengis.om.OMObservationPropertyType;
import net.opengis.om.OMObservationType;
import net.opengis.om.ObservationContextPropertyType;
import net.opengis.om.ObservationContextType;

@javax.jws.WebService(targetNamespace = "http://MashallerService.wxxm.com/", serviceName = "WXXMMashallerServiceService", portName = "WXXMMashallerServicePort", wsdlLocation = "WEB-INF/wsdl/WXXMMashallerServiceService.wsdl")

public class WXXMMashallerServiceDelegate {

	com.wxxm.MashallerService.WXXMMashallerService wXXMMashallerService = new com.wxxm.MashallerService.WXXMMashallerService();

	public String mashaller(Integer id) {
		return wXXMMashallerService.mashaller(id);
	}

}