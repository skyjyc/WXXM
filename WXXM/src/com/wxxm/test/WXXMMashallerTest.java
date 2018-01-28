package com.wxxm.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.jms.JMSException;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import com.cfar.swim.wxxm.bind.WxxmMarshaller;
import com.wxxm.MashallerService.WXXMMashallerService;
import com.wxxm.bean.Airmet;
import com.wxxm.bean.AirmetDAO;
import com.wxxm.bean.Issuingairtrafficservicesunit;
import com.wxxm.bean.IssuingairtrafficservicesunitContact;
import com.wxxm.bean.IssuingairtrafficservicesunitContactDAO;
import com.wxxm.bean.IssuingairtrafficservicesunitDAO;
import com.wxxm.bean.IssuingairtrafficservicesunitPosition;
import com.wxxm.bean.IssuingairtrafficservicesunitPositionDAO;
import com.wxxm.bean.IssuingairtrafficservicesunitRelatedunit;
import com.wxxm.bean.IssuingairtrafficservicesunitRelatedunitDAO;
import com.wxxm.bean.IssuingairtrafficserviceunitAvailability;
import com.wxxm.bean.IssuingairtrafficserviceunitAvailabilityDAO;
import com.wxxm.bean.ValidperiodBegin;
import com.wxxm.bean.ValidperiodBeginDAO;
import com.wxxm.bean.ValidperiodDurationandtimeinterval;
import com.wxxm.bean.ValidperiodDurationandtimeintervalDAO;
import com.wxxm.bean.ValidperiodEnd;
import com.wxxm.bean.ValidperiodEndDAO;

import aero.aixm.CodeDayType;
import aero.aixm.CodeMilitaryOperationsType;
import aero.aixm.CodeOrganisationDesignatorType;
import aero.aixm.CodeStatusOperationsType;
import aero.aixm.CodeTimeEventCombinationType;
import aero.aixm.CodeTimeEventType;
import aero.aixm.CodeTimeReferenceType;
import aero.aixm.CodeUnitDependencyType;
import aero.aixm.CodeUnitType;
import aero.aixm.CodeVerticalDatumType;
import aero.aixm.CodeYesNoType;
import aero.aixm.ContactInformationPropertyType;
import aero.aixm.ContactInformationType;
import aero.aixm.DateMonthDayType;
import aero.aixm.ElevatedPointPropertyType;
import aero.aixm.ElevatedPointType;
import aero.aixm.OrganisationAuthorityPropertyType;
import aero.aixm.TextNameType;
import aero.aixm.TimeType;
import aero.aixm.TimesheetPropertyType;
import aero.aixm.TimesheetType;
import aero.aixm.UnitAvailabilityPropertyType;
import aero.aixm.UnitAvailabilityType;
import aero.aixm.UnitDependencyPropertyType;
import aero.aixm.UnitDependencyType;
import aero.aixm.UnitTimeSlicePropertyType;
import aero.aixm.UnitTimeSliceType;
import aero.aixm.UnitType;
import aero.aixm.ValDistanceSignedType;
import aero.aixm.ValDistanceType;
import aero.aixm.ValDistanceVerticalType;
import aero.aixm.ValDurationType;
import aero.wxxm.AIRMETReportStatusType;
import aero.wxxm.AIRMETType;
import aero.wxxm.AeronauticalAreaWeatherPhenomenonType;
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

public class WXXMMashallerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WXXMMashallerService wXXMMashallerService=new WXXMMashallerService();
//		Integer i=1;
//		String testbuf=wXXMMashallerService.mashaller(i);
//		System.out.println(testbuf);
		 String buf=null;
		 Integer id=1;
		  aero.wxxm.ObjectFactory ofw=new aero.wxxm.ObjectFactory();
		  AIRMETType aIRMETType=ofw.createAIRMETType() ;
		  //UnitPropertyType issuingAirTrafficServicesUnit;
		  IssuingairtrafficservicesunitDAO issuingairtrafficservicesunitDAO=new IssuingairtrafficservicesunitDAO();
		  Issuingairtrafficservicesunit issuingairtrafficservicesunit=issuingairtrafficservicesunitDAO.findById(1);
		  aero.wxxm.UnitPropertyType unitPropertyType=ofw.createUnitPropertyType();
		  unitPropertyType.setActuate(issuingairtrafficservicesunit.getActuate());
		  unitPropertyType.setArcrole(issuingairtrafficservicesunit.getArcrole());
		  unitPropertyType.setHref(issuingairtrafficservicesunit.getHref());
		  unitPropertyType.setOwns(true);
		  unitPropertyType.setRemoteSchema(issuingairtrafficservicesunit.getRemoteSchema());
		  unitPropertyType.setRole(issuingairtrafficservicesunit.getRole());
		  unitPropertyType.setShow(issuingairtrafficservicesunit.getShow());
		  unitPropertyType.setTitle(issuingairtrafficservicesunit.getTitle());
		  unitPropertyType.setType(issuingairtrafficservicesunit.getType());
		    aero.aixm.ObjectFactory ofa=new aero.aixm.ObjectFactory ();
		    UnitType unitType=ofa.createUnitType();
		    UnitTimeSlicePropertyType unitTimeSlicePropertyType=ofa.createUnitTimeSlicePropertyType();
			UnitTimeSliceType unitTimeSliceType=ofa.createUnitTimeSliceType();
			    //JAXBElement<TextNameType> unitName;
				TextNameType textNameType=ofa.createTextNameType();
				textNameType.setNilReason(issuingairtrafficservicesunit.getUnitNamevalue());
				textNameType.setValue(issuingairtrafficservicesunit.getUnitNamenilReason());
				JAXBElement<TextNameType> jaxb_TextNameType=ofa.createUnitTimeSliceTypeName(textNameType);
				unitTimeSliceType.setUnitName(jaxb_TextNameType);
				//JAXBElement<CodeUnitType> type;
				CodeUnitType codeUnitType=ofa.createCodeUnitType();
				codeUnitType.setValue(issuingairtrafficservicesunit.getTypevalue());
				codeUnitType.setNilReason(issuingairtrafficservicesunit.getTypenilReason());
				JAXBElement<CodeUnitType> jaxb_type=ofa.createUnitTimeSliceTypeType(codeUnitType);
				unitTimeSliceType.setType(jaxb_type);
				//JAXBElement<CodeYesNoType> compliantICAO
				CodeYesNoType codeYesNoType=new CodeYesNoType();
				codeYesNoType.setValue(issuingairtrafficservicesunit.getCompliantIcaovalue());
				codeYesNoType.setNilReason(issuingairtrafficservicesunit.getCompliantIcaonilReason());
				JAXBElement<CodeYesNoType> jaxb_compliantICAO=ofa.createUnitTimeSliceTypeCompliantICAO(codeYesNoType);
				unitTimeSliceType.setCompliantICAO(jaxb_compliantICAO);
				//JAXBElement<CodeOrganisationDesignatorType> jaxb_designator
				CodeOrganisationDesignatorType codeOrganisationDesignatorType=new CodeOrganisationDesignatorType();
				codeOrganisationDesignatorType.setValue(issuingairtrafficservicesunit.getDesignatorvalue());
				codeOrganisationDesignatorType.setNilReason(issuingairtrafficservicesunit.getDesignatornilReason());
				JAXBElement<CodeOrganisationDesignatorType> jaxb_designator=ofa.createUnitTimeSliceTypeDesignator(codeOrganisationDesignatorType);
				unitTimeSliceType.setDesignator(jaxb_designator);
				//JAXBElement<CodeMilitaryOperationsType> military
				CodeMilitaryOperationsType codeMilitaryOperationsType=new CodeMilitaryOperationsType();
				codeMilitaryOperationsType.setValue(issuingairtrafficservicesunit.getMilitaryvalue());
				codeMilitaryOperationsType.setNilReason(issuingairtrafficservicesunit.getMilitarynilReason());
				JAXBElement<CodeMilitaryOperationsType> jaxb_military=ofa.createUnitTimeSliceTypeMilitary(codeMilitaryOperationsType);
				unitTimeSliceType.setMilitary(jaxb_military);
				//JAXBElement<ElevatedPointPropertyType> position
				IssuingairtrafficservicesunitPositionDAO issuingairtrafficservicesunitPositionDAO=new IssuingairtrafficservicesunitPositionDAO ();
				IssuingairtrafficservicesunitPosition issuingairtrafficservicesunitPosition=issuingairtrafficservicesunitPositionDAO.findById(id);
				ElevatedPointPropertyType elevatedPointPropertyType=new ElevatedPointPropertyType();
				ElevatedPointType elevatedPointType=new ElevatedPointType();
				    //JAXBElement<ValDistanceVerticalType> elevation;
					ValDistanceVerticalType valDistanceVerticalType=new ValDistanceVerticalType();
					valDistanceVerticalType.setValue(issuingairtrafficservicesunitPosition.getElevationValue());
					valDistanceVerticalType.setUom(issuingairtrafficservicesunitPosition.getElevationUom());
					valDistanceVerticalType.setNilReason(issuingairtrafficservicesunitPosition.getElevationNilReason());
					JAXBElement<ValDistanceVerticalType> jaxbElement_elevation=ofa.createAirportHeliportTimeSliceTypeFieldElevation(valDistanceVerticalType);
					elevatedPointType.setElevation(jaxbElement_elevation);
					//JAXBElement<ValDistanceSignedType> geoidUndulation
					ValDistanceSignedType valDistanceSignedType=new ValDistanceSignedType();
					valDistanceSignedType.setValue(new BigDecimal(issuingairtrafficservicesunitPosition.getGeoidUndulationValue()));
					valDistanceSignedType.setUom(issuingairtrafficservicesunitPosition.getGeoidUndulationUom());
					valDistanceSignedType.setNilReason(issuingairtrafficservicesunitPosition.getGeoidUndulationNilReason());
					JAXBElement<ValDistanceSignedType> jaxb_geoidUndulation=ofa.createElevatedPointTypeGeoidUndulation(valDistanceSignedType);
					elevatedPointType.setGeoidUndulation(jaxb_geoidUndulation);
					//JAXBElement<CodeVerticalDatumType> verticalDatum 
					CodeVerticalDatumType codeVerticalDatumType=new CodeVerticalDatumType();
					codeVerticalDatumType.setValue(issuingairtrafficservicesunitPosition.getVerticalDatumValue());
					codeVerticalDatumType.setNilReason(issuingairtrafficservicesunitPosition.getVerticalDatumNilReason());
					JAXBElement<CodeVerticalDatumType> jaxb_verticalDatum=ofa.createElevatedPointTypeVerticalDatum(codeVerticalDatumType);
					elevatedPointType.setVerticalDatum(jaxb_verticalDatum);
					//JAXBElement<ValDistanceType> verticalAccuracy
					ValDistanceType valDistanceType=new ValDistanceType();
					valDistanceType.setValue(new BigDecimal(issuingairtrafficservicesunitPosition.getVerticalAccuracyValue()));
					valDistanceType.setUom(issuingairtrafficservicesunitPosition.getVerticalAccuracyUom());
					valDistanceType.setNilReason(issuingairtrafficservicesunitPosition.getVerticalAccuracyNilReason());
					JAXBElement<ValDistanceType> jaxb_verticalAccuracy=ofa.createElevatedPointTypeVerticalAccuracy(valDistanceType);
					elevatedPointType.setVerticalAccuracy(jaxb_verticalAccuracy);
				
				elevatedPointPropertyType.setElevatedPoint(elevatedPointType);
				JAXBElement<ElevatedPointPropertyType> jaxb_position=ofa.createUnitTimeSliceTypePosition(elevatedPointPropertyType);
				unitTimeSliceType.setPosition(jaxb_position);
				//List<ContactInformationPropertyType> contact
				ContactInformationPropertyType contactInformationPropertyType=new ContactInformationPropertyType();
				ContactInformationType contactInformationType=new ContactInformationType();
				
				IssuingairtrafficservicesunitContactDAO issuingairtrafficservicesunitContactDAO=new IssuingairtrafficservicesunitContactDAO ();
				IssuingairtrafficservicesunitContact issuingairtrafficservicesunitContact=issuingairtrafficservicesunitContactDAO.findById(id);
					//JAXBElement<TextNameType> contactInformationName;
					TextNameType textNameType1=new TextNameType();
					textNameType1.setValue(issuingairtrafficservicesunitContact.getContactInformationNameValue());
					textNameType1.setNilReason(issuingairtrafficservicesunitContact.getContactInformationNameNilReason());
					JAXBElement<TextNameType> jaxb_contactInformationName=ofa.createContactInformationTypeName(textNameType1);
					contactInformationType.setContactInformationName(jaxb_contactInformationName);
					//JAXBElement<TextNameType> title
					TextNameType textNameType2=new TextNameType();
					textNameType2.setValue(issuingairtrafficservicesunitContact.getTitleValue());
					textNameType2.setNilReason(issuingairtrafficservicesunitContact.getTitleNilReason());
					JAXBElement<TextNameType> jaxb_title=ofa.createContactInformationTypeTitle(textNameType2);
					contactInformationType.setTitle(jaxb_title);
				contactInformationPropertyType.setContactInformation(contactInformationType);
				unitTimeSliceType.getContact().add(contactInformationPropertyType);
				//List<UnitDependencyPropertyType> relatedUnit
				IssuingairtrafficservicesunitRelatedunitDAO issuingairtrafficservicesunitRelatedunitDAO=new IssuingairtrafficservicesunitRelatedunitDAO();
				IssuingairtrafficservicesunitRelatedunit IssuingairtrafficservicesunitRelatedunit=issuingairtrafficservicesunitRelatedunitDAO.findById(id);
				
				UnitDependencyPropertyType unitDependencyPropertyType=new UnitDependencyPropertyType();
				UnitDependencyType unitDependencyType=new UnitDependencyType();
					//JAXBElement<CodeUnitDependencyType> type
					CodeUnitDependencyType codeUnitDependencyType=new CodeUnitDependencyType();
					codeUnitDependencyType.setValue(IssuingairtrafficservicesunitRelatedunit.getTypeValue());
					codeUnitDependencyType.setNilReason(IssuingairtrafficservicesunitRelatedunit.getTypenilReason());
					JAXBElement<CodeUnitDependencyType> jaxb_type1=ofa.createUnitDependencyTypeType(codeUnitDependencyType);
					unitDependencyType.setType(jaxb_type1);
				unitDependencyPropertyType.setUnitDependency(unitDependencyType);
				unitTimeSliceType.getRelatedUnit().add(unitDependencyPropertyType);
				
				//List<UnitAvailabilityPropertyType> availability
				UnitAvailabilityPropertyType unitAvailabilityPropertyType=new UnitAvailabilityPropertyType();
				
				IssuingairtrafficserviceunitAvailabilityDAO issuingairtrafficservicesunitAvailabilityDAO=new IssuingairtrafficserviceunitAvailabilityDAO();
				IssuingairtrafficserviceunitAvailability issuingairtrafficserviceunitAvailability=issuingairtrafficservicesunitAvailabilityDAO.findById(id);
				UnitAvailabilityType unitAvailabilityType=new UnitAvailabilityType();
					//List<TimesheetPropertyType> timeInterval
					TimesheetPropertyType timesheetPropertyType=new TimesheetPropertyType();
					TimesheetType timesheetType=new TimesheetType();
						//JAXBElement<CodeTimeReferenceType> timeReference
						CodeTimeReferenceType codeTimeReferenceType=new CodeTimeReferenceType();
						codeTimeReferenceType.setValue(issuingairtrafficserviceunitAvailability.getTimeReferenceValue());
						codeTimeReferenceType.setNilReason(issuingairtrafficserviceunitAvailability.getTimeReferenceNilReason());
						JAXBElement<CodeTimeReferenceType> JAXB_timeReference=ofa.createTimesheetTypeTimeReference(codeTimeReferenceType);
						timesheetType.setTimeReference(JAXB_timeReference);
						//JAXBElement<DateMonthDayType> startDate
						DateMonthDayType dateMonthDayType=new DateMonthDayType();
						dateMonthDayType.setValue(issuingairtrafficserviceunitAvailability.getStartDateValue());
						dateMonthDayType.setNilReason(issuingairtrafficserviceunitAvailability.getStartDateNilReason());
						JAXBElement<DateMonthDayType> jaxb_startDate=ofa.createTimesheetTypeStartDate(dateMonthDayType);
						timesheetType.setStartDate(jaxb_startDate);
						//JAXBElement<DateMonthDayType> endDate
						DateMonthDayType dateMonthDayType1=new DateMonthDayType();
						dateMonthDayType1.setValue(issuingairtrafficserviceunitAvailability.getEndDateValue());
						dateMonthDayType1.setNilReason(issuingairtrafficserviceunitAvailability.getEndDateNilReason());
						JAXBElement<DateMonthDayType> jaxb_endDate=ofa.createTimesheetTypeEndDate(dateMonthDayType);
						timesheetType.setEndDate(jaxb_endDate);
						//JAXBElement<CodeDayType> day
						CodeDayType codeDayType=new CodeDayType();
						codeDayType.setValue(issuingairtrafficserviceunitAvailability.getDayValue());
						codeDayType.setNilReason(issuingairtrafficserviceunitAvailability.getDayNilReason());
						JAXBElement<CodeDayType> jaxb_day=ofa.createTimesheetTypeDay(codeDayType);
						timesheetType.setDay(jaxb_day);
						//JAXBElement<CodeDayType> dayTil
						CodeDayType codeDayType1=new CodeDayType();
						codeDayType1.setValue(issuingairtrafficserviceunitAvailability.getDayTilValue());
						codeDayType1.setNilReason(issuingairtrafficserviceunitAvailability.getDayTilNilReason());
						JAXBElement<CodeDayType> jaxb_day1=ofa.createTimesheetTypeDay(codeDayType1);
						timesheetType.setDay(jaxb_day1);
						//JAXBElement<TimeType> startTime
						TimeType timeType=new TimeType();
						timeType.setValue(issuingairtrafficserviceunitAvailability.getStartTimeValue());
						timeType.setNilReason(issuingairtrafficserviceunitAvailability.getStartTimeNilReason());
						
						JAXBElement<TimeType> jaxb_startTime=ofa.createTimesheetTypeStartTime(timeType);
						timesheetType.setStartTime(jaxb_startTime);
						// JAXBElement<CodeTimeEventType> startEvent
						CodeTimeEventType codeTimeEventType=new CodeTimeEventType();
						codeTimeEventType.setValue(issuingairtrafficserviceunitAvailability.getStartEventValue());
						codeTimeEventType.setNilReason(issuingairtrafficserviceunitAvailability.getStartEventNilReason());
						
						JAXBElement<CodeTimeEventType> jaxb_startEvent=ofa.createTimesheetTypeStartEvent(codeTimeEventType);
						timesheetType.setStartEvent(jaxb_startEvent);
						//JAXBElement<ValDurationType> startTimeRelativeEvent
						ValDurationType valDurationType=new ValDurationType();
						valDurationType.setValue(new BigDecimal(issuingairtrafficserviceunitAvailability.getStartTimeRelativeEventValue()));
						valDurationType.setUom(issuingairtrafficserviceunitAvailability.getStartTimeRelativeEventUom());
						valDurationType.setNilReason(issuingairtrafficserviceunitAvailability.getStartTimeRelativeEventNilReason());
						
						JAXBElement<ValDurationType> jaxb_startTimeRelativeEvent=ofa.createTimesheetTypeStartTimeRelativeEvent(valDurationType);
						timesheetType.setStartTimeRelativeEvent(jaxb_startTimeRelativeEvent);
						//JAXBElement<CodeTimeEventCombinationType> startEventInterpretation
						CodeTimeEventCombinationType codeTimeEventCombinationType=new CodeTimeEventCombinationType();
						codeTimeEventCombinationType.setValue(issuingairtrafficserviceunitAvailability.getStartEventInterpretationValue());
						codeTimeEventCombinationType.setNilReason(issuingairtrafficserviceunitAvailability.getStartEventInterpretationNilReason());
						JAXBElement<CodeTimeEventCombinationType> jaxb_startEventInterpretation =ofa.createTimesheetTypeStartEventInterpretation(codeTimeEventCombinationType);
						timesheetType.setStartEventInterpretation(jaxb_startEventInterpretation);
						//
						//JAXBElement<TimeType> EndTime
						TimeType timeType1=new TimeType();
						timeType1.setValue(issuingairtrafficserviceunitAvailability.getEndTimeValue());
						timeType1.setNilReason(issuingairtrafficserviceunitAvailability.getEndTimeNilReason());
						
						JAXBElement<TimeType> jaxb_EndTime=ofa.createTimesheetTypeEndTime(timeType1);
						timesheetType.setEndTime(jaxb_EndTime);
						// JAXBElement<CodeTimeEventType> EndEvent
						CodeTimeEventType codeTimeEventType1=new CodeTimeEventType();
						codeTimeEventType1.setValue(issuingairtrafficserviceunitAvailability.getEndEventValue());
						codeTimeEventType1.setNilReason(issuingairtrafficserviceunitAvailability.getEndEventNilReason());
						
						JAXBElement<CodeTimeEventType> jaxb_EndEvent=ofa.createTimesheetTypeEndEvent(codeTimeEventType1);
						timesheetType.setEndEvent(jaxb_EndEvent);
						//JAXBElement<ValDurationType> EndTimeRelativeEvent
						ValDurationType valDurationType1=new ValDurationType();
						valDurationType1.setValue(new BigDecimal(issuingairtrafficserviceunitAvailability.getEndTimeRelativeEventValue()));
						valDurationType1.setUom(issuingairtrafficserviceunitAvailability.getEndTimeRelativeEventUom());
						valDurationType1.setNilReason(issuingairtrafficserviceunitAvailability.getEndTimeRelativeEventNilReason());
						
						JAXBElement<ValDurationType> jaxb_EndTimeRelativeEvent=ofa.createTimesheetTypeEndTimeRelativeEvent(valDurationType1);
						timesheetType.setEndTimeRelativeEvent(jaxb_EndTimeRelativeEvent);
						//JAXBElement<CodeTimeEventCombinationType> EndEventInterpretation
						CodeTimeEventCombinationType codeTimeEventCombinationType1=new CodeTimeEventCombinationType();
						codeTimeEventCombinationType1.setValue(issuingairtrafficserviceunitAvailability.getEndEventInterpretationValue());
						codeTimeEventCombinationType1.setNilReason(issuingairtrafficserviceunitAvailability.getEndEventInterpretationNilReason());
						JAXBElement<CodeTimeEventCombinationType> jaxb_EndEventInterpretation =ofa.createTimesheetTypeEndEventInterpretation(codeTimeEventCombinationType1);
						timesheetType.setEndEventInterpretation(jaxb_EndEventInterpretation);
						//JAXBElement<CodeYesNoType> daylightSavingAdjust
						CodeYesNoType codeYesNoType1=new CodeYesNoType();
						codeYesNoType1.setValue(issuingairtrafficserviceunitAvailability.getDaylightSavingAdjustValue());
						codeYesNoType1.setNilReason(issuingairtrafficserviceunitAvailability.getDaylightSavingAdjustNilReason());
						JAXBElement<CodeYesNoType> jaxb_daylightSavingAdjust=ofa.createTimesheetTypeDaylightSavingAdjust(codeYesNoType1);
						timesheetType.setDaylightSavingAdjust(jaxb_daylightSavingAdjust);
						//JAXBElement<CodeYesNoType> excluded;
						CodeYesNoType codeYesNoType2=new CodeYesNoType();
						codeYesNoType2.setValue(issuingairtrafficserviceunitAvailability.getExcludedValue());
						codeYesNoType2.setNilReason(issuingairtrafficserviceunitAvailability.getExcludedNilReason());
						JAXBElement<CodeYesNoType> jaxb_excluded=ofa.createTimesheetTypeExcluded(codeYesNoType2);
						timesheetType.setExcluded(jaxb_excluded);
						timesheetPropertyType.setTimesheet(timesheetType);
					unitAvailabilityType.getTimeInterval().add(timesheetPropertyType);
					unitAvailabilityPropertyType.setUnitAvailability(unitAvailabilityType);
					
					//List<OrganisationAuthorityPropertyType> specialDateAuthority
					OrganisationAuthorityPropertyType organisationAuthorityPropertyType=new OrganisationAuthorityPropertyType();
					organisationAuthorityPropertyType.getNilReason().add(issuingairtrafficserviceunitAvailability.getOaptnilReason());
					organisationAuthorityPropertyType.setActuate(issuingairtrafficserviceunitAvailability.getOaptactuate());
					organisationAuthorityPropertyType.setArcrole(issuingairtrafficserviceunitAvailability.getOaptarcrole());
					organisationAuthorityPropertyType.setHref(issuingairtrafficserviceunitAvailability.getOapthref());
					organisationAuthorityPropertyType.setOwns(true);
					organisationAuthorityPropertyType.setRemoteSchema(issuingairtrafficserviceunitAvailability.getOaptremoteSchema());
					organisationAuthorityPropertyType.setRole(issuingairtrafficserviceunitAvailability.getOaptrole());
					organisationAuthorityPropertyType.setShow(issuingairtrafficserviceunitAvailability.getOaptshow());
					organisationAuthorityPropertyType.setTitle(issuingairtrafficserviceunitAvailability.getOapttitle());
					organisationAuthorityPropertyType.setType(issuingairtrafficserviceunitAvailability.getOapttype());
					unitAvailabilityType.getSpecialDateAuthority().add(organisationAuthorityPropertyType);
					//JAXBElement<CodeStatusOperationsType> operationalStatus
					CodeStatusOperationsType codeStatusOperationsType=new CodeStatusOperationsType();
					codeStatusOperationsType.setValue(issuingairtrafficserviceunitAvailability.getOperationalStatusValue());
					codeStatusOperationsType.setNilReason(issuingairtrafficserviceunitAvailability.getOperationalStatusNilReason());
					JAXBElement<CodeStatusOperationsType> jaxb_operationalStatus=ofa.createUnitAvailabilityTypeOperationalStatus(codeStatusOperationsType);
					unitAvailabilityType.setOperationalStatus(jaxb_operationalStatus);
					unitAvailabilityPropertyType.setUnitAvailability(unitAvailabilityType);
				unitTimeSliceType.getAvailability().add(unitAvailabilityPropertyType);
				
			unitTimeSlicePropertyType.setUnitTimeSlice(unitTimeSliceType);
		unitTimeSlicePropertyType.setOwns(true);
	unitType.getTimeSlice().add(unitTimeSlicePropertyType);
	unitPropertyType.setUnit(unitType);
	aIRMETType.setIssuingAirTrafficServicesUnit(unitPropertyType);
	aIRMETType.setOriginatingMeteorologicalWatchOffice(unitPropertyType);
	//TimePeriodPropertyType validPeriod;
	ValidperiodBeginDAO validperiodBeginDAO=new ValidperiodBeginDAO();
	ValidperiodBegin validperiodBegin=validperiodBeginDAO.findById(id);
	ValidperiodEndDAO validperiodEndDAO=new ValidperiodEndDAO();
	ValidperiodEnd validperiodEnd=validperiodEndDAO.findById(id);
	ValidperiodDurationandtimeintervalDAO validperiodDurationandtimeintervalDAO=new ValidperiodDurationandtimeintervalDAO();
	ValidperiodDurationandtimeinterval validperiodDurationandtimeinterval=validperiodDurationandtimeintervalDAO.findById(id);
	TimePeriodPropertyType timePeriodPropertyType=new TimePeriodPropertyType();
	//timePeriodPropertyType.setActuate(value);
	//timePeriodPropertyType.setArcrole(value);
	//timePeriodPropertyType.setHref(value);
	//timePeriodPropertyType.setOwns(value);
	//timePeriodPropertyType.setRemoteSchema(value);
	//timePeriodPropertyType.setRole(value);
	//timePeriodPropertyType.setShow(value);
	//timePeriodPropertyType.setTitle(value);
	//timePeriodPropertyType.setType(value);

		//TimePeriodType timePeriod;
		TimePeriodType timePeriodType=new TimePeriodType();
			//TimePositionType beginPosition
			TimePositionType timePositionType=new TimePositionType();
			timePositionType.setCalendarEraName(validperiodBegin.getBeginPositionCalendarEraName());
			timePositionType.setFrame(validperiodBegin.getBeginPositionFrame());
			timePositionType.setIndeterminatePosition(TimeIndeterminateValueType.fromValue(validperiodBegin.getBeginPositionindeterminatePosition()));
			timePositionType.getValue().add(validperiodBegin.getBeginPositionValue());
			timePeriodType.setBeginPosition(timePositionType);
			//TimeInstantPropertyType begin
			TimeInstantPropertyType timeInstantPropertyType=new TimeInstantPropertyType();
			timeInstantPropertyType.setActuate(validperiodBegin.getBeginactuate());
			timeInstantPropertyType.setArcrole(validperiodBegin.getBeginArctole());
			timeInstantPropertyType.setHref(validperiodBegin.getBeginHref());
			timeInstantPropertyType.setOwns(true);
			timeInstantPropertyType.setRemoteSchema(validperiodBegin.getBeginremoteSchema());
			timeInstantPropertyType.setRole(validperiodBegin.getBeginRole());
			timeInstantPropertyType.setShow(validperiodBegin.getBeginShow());
			timeInstantPropertyType.setTitle(validperiodBegin.getBeginTitle());
			timeInstantPropertyType.setType(validperiodBegin.getBeginType());
			TimeInstantType timeInstantType=new TimeInstantType();
			TimePositionType timePositionType1=new TimePositionType();
			timePositionType1.setCalendarEraName(validperiodBegin.getBeginCalendarEraName());
			timePositionType1.setFrame(validperiodBegin.getBegiFrame());
			timePositionType1.setIndeterminatePosition(TimeIndeterminateValueType.fromValue(validperiodBegin.getBeginIndeterminatePosition()));
			timePositionType1.getValue().add(validperiodBegin.getBeginValue());
			timeInstantType.setTimePosition(timePositionType1);
			timeInstantPropertyType.setTimeInstant(timeInstantType);
			timePeriodType.setBegin(timeInstantPropertyType);
			//TimePositionType EndPosition
					TimePositionType timePositionType2=new TimePositionType();
					timePositionType2.setCalendarEraName(validperiodEnd.getEndPositionCalendarEraName());
					timePositionType2.setFrame(validperiodEnd.getEndPositionFrame());
					timePositionType2.setIndeterminatePosition(TimeIndeterminateValueType.fromValue(validperiodEnd.getEndPositionindeterminatePosition()));
					timePositionType2.getValue().add(validperiodEnd.getEndPositionValue());
					timePeriodType.setEndPosition(timePositionType2);
					//TimeInstantPropertyType End
					TimeInstantPropertyType timeInstantPropertyType1=new TimeInstantPropertyType();
					timeInstantPropertyType1.setActuate(validperiodEnd.getEndactuate());
					timeInstantPropertyType1.setArcrole(validperiodEnd.getEndArctole());
					timeInstantPropertyType1.setHref(validperiodEnd.getEndHref());
					timeInstantPropertyType1.setOwns(true);
					timeInstantPropertyType1.setRemoteSchema(validperiodEnd.getEndremoteSchema());
					timeInstantPropertyType1.setRole(validperiodEnd.getEndRole());
					timeInstantPropertyType1.setShow(validperiodEnd.getBeginShow());
					timeInstantPropertyType1.setTitle(validperiodEnd.getEndTitle());
					timeInstantPropertyType1.setType(validperiodEnd.getEndType());
					TimeInstantType timeInstantType1=new TimeInstantType();
					TimePositionType timePositionType3=new TimePositionType();
					timePositionType3.setCalendarEraName(validperiodEnd.getEndCalendarEraName());
					timePositionType3.setFrame(validperiodEnd.getEndFrame());
					timePositionType3.setIndeterminatePosition(TimeIndeterminateValueType.fromValue(validperiodEnd.getEndIndeterminatePosition()));
					timePositionType3.getValue().add(validperiodEnd.getEndValue());
					timeInstantType1.setTimePosition(timePositionType3);
					timeInstantPropertyType1.setTimeInstant(timeInstantType1);
					timePeriodType.setEnd(timeInstantPropertyType1);
			TimeIntervalLengthType timeIntervalLengthType=new TimeIntervalLengthType();
			timeIntervalLengthType.setValue(new BigDecimal(validperiodDurationandtimeinterval.getTimeIntervalValue()));
			timeIntervalLengthType.setFactor(new BigInteger(validperiodDurationandtimeinterval.getTimeIntervalFactor().toString()));
			timeIntervalLengthType.setRadix(new BigInteger(validperiodDurationandtimeinterval.getTimeIntervalValueRadix().toString()));
			timeIntervalLengthType.setUnit(validperiodDurationandtimeinterval.getTimeIntervalUnit());
			timePeriodType.setTimeInterval(timeIntervalLengthType);
			timePeriodPropertyType.setTimePeriod(timePeriodType);
			aIRMETType.setValidPeriod(timePeriodPropertyType);
			aIRMETType.setCancelledValidPeriod(timePeriodPropertyType);
	// protected UnitPropertyType originatingMeteorologicalWatchOffice;
			//TODO
	//protected TimePeriodPropertyType cancelledValidPeriod;
			//TODO
	//String sequenceNumber
	AirmetDAO AirmetDAO=new AirmetDAO();
	Airmet airmet=AirmetDAO.findById(id);
	aIRMETType.setSequenceNumber(airmet.getSequenceNumber());
	aIRMETType.setCancelledSequenceNumber(airmet.getCancelledSequenceNumber());
	// protected LengthType surfaceVisibility;
	LengthType lengthType=new LengthType();
	lengthType.setValue(airmet.getSurfaceVisibilityvalue());
	lengthType.setUom(airmet.getSurfaceWindSpeeduom());
	aIRMETType.setSurfaceVisibility(lengthType);

	//protected SpeedType surfaceWindSpeed;
	SpeedType speedType=new SpeedType();
	speedType.setValue(airmet.getSurfaceWindSpeedValue());
	speedType.setUom(airmet.getSurfaceWindSpeeduom());
	aIRMETType.setSurfaceWindSpeed(speedType);
	// protected AIRMETReportStatusType status
	aIRMETType.setStatus(AIRMETReportStatusType.fromValue(airmet.getAirmetreportStatusType()));
	//////////////粘贴的wxxmtest工程里的代码，为何数据库相连
	AeronauticalAreaWeatherPhenomenonType aeronauticalAreaWeatherPhenomenonType=ofw.createAeronauticalAreaWeatherPhenomenonType();
	//aIRMETType.setPhenomenon(aeronauticalAreaWeatherPhenomenonType);
	net.opengis.om.ObjectFactory of3=new net.opengis.om.ObjectFactory();
	net.opengis.gml.ObjectFactory of2=new net.opengis.gml.ObjectFactory();
	aeronauticalAreaWeatherPhenomenonType.setActuate("aeronauticalAreaWeatherPhenomenonType.setActuate");
	aeronauticalAreaWeatherPhenomenonType.setArcrole("aeronauticalAreaWeatherPhenomenonType.setArcrole");
	aeronauticalAreaWeatherPhenomenonType.setHref("aeronauticalAreaWeatherPhenomenonType.setHref");
	aeronauticalAreaWeatherPhenomenonType.setOwns(true);
	aeronauticalAreaWeatherPhenomenonType.setRemoteSchema("aeronauticalAreaWeatherPhenomenonType.setRemoteSchema");
	aeronauticalAreaWeatherPhenomenonType.setRole("aeronauticalAreaWeatherPhenomenonType.setRole");
	aeronauticalAreaWeatherPhenomenonType.setShow("aeronauticalAreaWeatherPhenomenonType.setShow");
	aeronauticalAreaWeatherPhenomenonType.setTitle("aeronauticalAreaWeatherPhenomenonType.setTitle");
	aeronauticalAreaWeatherPhenomenonType.setType("aeronauticalAreaWeatherPhenomenonType.setType");
	OMObservationPropertyType oMObservationPropertyType=of3.createOMObservationPropertyType();
	OMObservationType oMObservationType =of3.createOMObservationType();
	ReferenceType referenceType=of2.createReferenceType();
	referenceType.getNilReason().add("referenceType.getNilReason().add_jyc");
	referenceType.setActuate("referenceType.setActuate_jyc");
	referenceType.setArcrole("referenceType.setArcrole_jyc");
	referenceType.setHref("referenceType.setHref_jyc");
	referenceType.setHref("referenceType.setHref_jyc");
	oMObservationType.setType(referenceType);
	ObservationContextPropertyType observationContextPropertyType=of3.createObservationContextPropertyType();
	ObservationContextType observationContextType=of3.createObservationContextType();
	//observationContextType.setRelatedObservation(referenceType);
	observationContextType.setRelatedObservation(referenceType);
	observationContextPropertyType.setObservationContext(observationContextType);
	oMObservationType.getRelatedObservation().add(observationContextPropertyType);
	oMObservationPropertyType.setOMObservation(oMObservationType);
	aIRMETType.getAnalysis().add(oMObservationPropertyType);
	aIRMETType.setPhenomenon(aeronauticalAreaWeatherPhenomenonType);

	JAXBElement<AIRMETType> jaxb_AIRMETType=ofw.createAIRMET(aIRMETType);
	WxxmMarshaller wxxmMarshaller;
	ByteArrayOutputStream bytearrayoutputstream=new ByteArrayOutputStream();
	try {
		wxxmMarshaller = new WxxmMarshaller();
		wxxmMarshaller.marshal(jaxb_AIRMETType, bytearrayoutputstream);
	} catch (JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String outString=bytearrayoutputstream.toString();
	JMSWXXMProducer jmsWXXMProducer=new JMSWXXMProducer();
	try {
		jmsWXXMProducer.producer();
		jmsWXXMProducer.textMessageGenerate(outString);
		jmsWXXMProducer.sendMessage();
		jmsWXXMProducer.close();
	} catch (JMSException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	try {
		bytearrayoutputstream.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
