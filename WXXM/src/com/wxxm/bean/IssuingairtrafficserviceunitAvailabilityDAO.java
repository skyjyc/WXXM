package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * IssuingairtrafficserviceunitAvailability entities. Transaction control of the
 * save(), update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.wxxm.bean.IssuingairtrafficserviceunitAvailability
 * @author MyEclipse Persistence Tools
 */
public class IssuingairtrafficserviceunitAvailabilityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(IssuingairtrafficserviceunitAvailabilityDAO.class);
	// property constants
	public static final String TIME_REFERENCE_VALUE = "timeReferenceValue";
	public static final String TIME_REFERENCE_NIL_REASON = "timeReferenceNilReason";
	public static final String START_DATE_VALUE = "startDateValue";
	public static final String START_DATE_NIL_REASON = "startDateNilReason";
	public static final String END_DATE_VALUE = "endDateValue";
	public static final String END_DATE_NIL_REASON = "endDateNilReason";
	public static final String DAY_VALUE = "dayValue";
	public static final String DAY_NIL_REASON = "dayNilReason";
	public static final String DAY_TIL_VALUE = "dayTilValue";
	public static final String DAY_TIL_NIL_REASON = "dayTilNilReason";
	public static final String START_TIME_VALUE = "startTimeValue";
	public static final String START_TIME_NIL_REASON = "startTimeNilReason";
	public static final String START_EVENT_VALUE = "startEventValue";
	public static final String START_EVENT_NIL_REASON = "startEventNilReason";
	public static final String START_TIME_RELATIVE_EVENT_VALUE = "startTimeRelativeEventValue";
	public static final String START_TIME_RELATIVE_EVENT_UOM = "startTimeRelativeEventUom";
	public static final String START_TIME_RELATIVE_EVENT_NIL_REASON = "startTimeRelativeEventNilReason";
	public static final String START_EVENT_INTERPRETATION_VALUE = "startEventInterpretationValue";
	public static final String START_EVENT_INTERPRETATION_NIL_REASON = "startEventInterpretationNilReason";
	public static final String END_TIME_VALUE = "endTimeValue";
	public static final String END_TIME_NIL_REASON = "endTimeNilReason";
	public static final String END_EVENT_VALUE = "endEventValue";
	public static final String END_EVENT_NIL_REASON = "endEventNilReason";
	public static final String END_TIME_RELATIVE_EVENT_VALUE = "endTimeRelativeEventValue";
	public static final String END_TIME_RELATIVE_EVENT_UOM = "endTimeRelativeEventUom";
	public static final String END_TIME_RELATIVE_EVENT_NIL_REASON = "endTimeRelativeEventNilReason";
	public static final String END_EVENT_INTERPRETATION_VALUE = "endEventInterpretationValue";
	public static final String END_EVENT_INTERPRETATION_NIL_REASON = "endEventInterpretationNilReason";
	public static final String DAYLIGHT_SAVING_ADJUST_VALUE = "daylightSavingAdjustValue";
	public static final String DAYLIGHT_SAVING_ADJUST_NIL_REASON = "daylightSavingAdjustNilReason";
	public static final String EXCLUDED_VALUE = "excludedValue";
	public static final String EXCLUDED_NIL_REASON = "excludedNilReason";
	public static final String OAPTNIL_REASON = "oaptnilReason";
	public static final String OAPTREMOTE_SCHEMA = "oaptremoteSchema";
	public static final String OAPTTYPE = "oapttype";
	public static final String OAPTHREF = "oapthref";
	public static final String OAPTROLE = "oaptrole";
	public static final String OAPTARCROLE = "oaptarcrole";
	public static final String OAPTTITLE = "oapttitle";
	public static final String OAPTSHOW = "oaptshow";
	public static final String OAPTACTUATE = "oaptactuate";
	public static final String OAPTOWNS = "oaptowns";
	public static final String OPERATIONAL_STATUS_VALUE = "operationalStatusValue";
	public static final String OPERATIONAL_STATUS_NIL_REASON = "operationalStatusNilReason";

	public void save(IssuingairtrafficserviceunitAvailability transientInstance) {
		log.debug("saving IssuingairtrafficserviceunitAvailability instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IssuingairtrafficserviceunitAvailability persistentInstance) {
		log.debug("deleting IssuingairtrafficserviceunitAvailability instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IssuingairtrafficserviceunitAvailability findById(java.lang.Integer id) {
		log.debug("getting IssuingairtrafficserviceunitAvailability instance with id: " + id);
		try {
			IssuingairtrafficserviceunitAvailability instance = (IssuingairtrafficserviceunitAvailability) getSession()
					.get("com.wxxm.bean.IssuingairtrafficserviceunitAvailability", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IssuingairtrafficserviceunitAvailability instance) {
		log.debug("finding IssuingairtrafficserviceunitAvailability instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.IssuingairtrafficserviceunitAvailability")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IssuingairtrafficserviceunitAvailability instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IssuingairtrafficserviceunitAvailability as model where model." + propertyName
					+ "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTimeReferenceValue(Object timeReferenceValue) {
		return findByProperty(TIME_REFERENCE_VALUE, timeReferenceValue);
	}

	public List findByTimeReferenceNilReason(Object timeReferenceNilReason) {
		return findByProperty(TIME_REFERENCE_NIL_REASON, timeReferenceNilReason);
	}

	public List findByStartDateValue(Object startDateValue) {
		return findByProperty(START_DATE_VALUE, startDateValue);
	}

	public List findByStartDateNilReason(Object startDateNilReason) {
		return findByProperty(START_DATE_NIL_REASON, startDateNilReason);
	}

	public List findByEndDateValue(Object endDateValue) {
		return findByProperty(END_DATE_VALUE, endDateValue);
	}

	public List findByEndDateNilReason(Object endDateNilReason) {
		return findByProperty(END_DATE_NIL_REASON, endDateNilReason);
	}

	public List findByDayValue(Object dayValue) {
		return findByProperty(DAY_VALUE, dayValue);
	}

	public List findByDayNilReason(Object dayNilReason) {
		return findByProperty(DAY_NIL_REASON, dayNilReason);
	}

	public List findByDayTilValue(Object dayTilValue) {
		return findByProperty(DAY_TIL_VALUE, dayTilValue);
	}

	public List findByDayTilNilReason(Object dayTilNilReason) {
		return findByProperty(DAY_TIL_NIL_REASON, dayTilNilReason);
	}

	public List findByStartTimeValue(Object startTimeValue) {
		return findByProperty(START_TIME_VALUE, startTimeValue);
	}

	public List findByStartTimeNilReason(Object startTimeNilReason) {
		return findByProperty(START_TIME_NIL_REASON, startTimeNilReason);
	}

	public List findByStartEventValue(Object startEventValue) {
		return findByProperty(START_EVENT_VALUE, startEventValue);
	}

	public List findByStartEventNilReason(Object startEventNilReason) {
		return findByProperty(START_EVENT_NIL_REASON, startEventNilReason);
	}

	public List findByStartTimeRelativeEventValue(Object startTimeRelativeEventValue) {
		return findByProperty(START_TIME_RELATIVE_EVENT_VALUE, startTimeRelativeEventValue);
	}

	public List findByStartTimeRelativeEventUom(Object startTimeRelativeEventUom) {
		return findByProperty(START_TIME_RELATIVE_EVENT_UOM, startTimeRelativeEventUom);
	}

	public List findByStartTimeRelativeEventNilReason(Object startTimeRelativeEventNilReason) {
		return findByProperty(START_TIME_RELATIVE_EVENT_NIL_REASON, startTimeRelativeEventNilReason);
	}

	public List findByStartEventInterpretationValue(Object startEventInterpretationValue) {
		return findByProperty(START_EVENT_INTERPRETATION_VALUE, startEventInterpretationValue);
	}

	public List findByStartEventInterpretationNilReason(Object startEventInterpretationNilReason) {
		return findByProperty(START_EVENT_INTERPRETATION_NIL_REASON, startEventInterpretationNilReason);
	}

	public List findByEndTimeValue(Object endTimeValue) {
		return findByProperty(END_TIME_VALUE, endTimeValue);
	}

	public List findByEndTimeNilReason(Object endTimeNilReason) {
		return findByProperty(END_TIME_NIL_REASON, endTimeNilReason);
	}

	public List findByEndEventValue(Object endEventValue) {
		return findByProperty(END_EVENT_VALUE, endEventValue);
	}

	public List findByEndEventNilReason(Object endEventNilReason) {
		return findByProperty(END_EVENT_NIL_REASON, endEventNilReason);
	}

	public List findByEndTimeRelativeEventValue(Object endTimeRelativeEventValue) {
		return findByProperty(END_TIME_RELATIVE_EVENT_VALUE, endTimeRelativeEventValue);
	}

	public List findByEndTimeRelativeEventUom(Object endTimeRelativeEventUom) {
		return findByProperty(END_TIME_RELATIVE_EVENT_UOM, endTimeRelativeEventUom);
	}

	public List findByEndTimeRelativeEventNilReason(Object endTimeRelativeEventNilReason) {
		return findByProperty(END_TIME_RELATIVE_EVENT_NIL_REASON, endTimeRelativeEventNilReason);
	}

	public List findByEndEventInterpretationValue(Object endEventInterpretationValue) {
		return findByProperty(END_EVENT_INTERPRETATION_VALUE, endEventInterpretationValue);
	}

	public List findByEndEventInterpretationNilReason(Object endEventInterpretationNilReason) {
		return findByProperty(END_EVENT_INTERPRETATION_NIL_REASON, endEventInterpretationNilReason);
	}

	public List findByDaylightSavingAdjustValue(Object daylightSavingAdjustValue) {
		return findByProperty(DAYLIGHT_SAVING_ADJUST_VALUE, daylightSavingAdjustValue);
	}

	public List findByDaylightSavingAdjustNilReason(Object daylightSavingAdjustNilReason) {
		return findByProperty(DAYLIGHT_SAVING_ADJUST_NIL_REASON, daylightSavingAdjustNilReason);
	}

	public List findByExcludedValue(Object excludedValue) {
		return findByProperty(EXCLUDED_VALUE, excludedValue);
	}

	public List findByExcludedNilReason(Object excludedNilReason) {
		return findByProperty(EXCLUDED_NIL_REASON, excludedNilReason);
	}

	public List findByOaptnilReason(Object oaptnilReason) {
		return findByProperty(OAPTNIL_REASON, oaptnilReason);
	}

	public List findByOaptremoteSchema(Object oaptremoteSchema) {
		return findByProperty(OAPTREMOTE_SCHEMA, oaptremoteSchema);
	}

	public List findByOapttype(Object oapttype) {
		return findByProperty(OAPTTYPE, oapttype);
	}

	public List findByOapthref(Object oapthref) {
		return findByProperty(OAPTHREF, oapthref);
	}

	public List findByOaptrole(Object oaptrole) {
		return findByProperty(OAPTROLE, oaptrole);
	}

	public List findByOaptarcrole(Object oaptarcrole) {
		return findByProperty(OAPTARCROLE, oaptarcrole);
	}

	public List findByOapttitle(Object oapttitle) {
		return findByProperty(OAPTTITLE, oapttitle);
	}

	public List findByOaptshow(Object oaptshow) {
		return findByProperty(OAPTSHOW, oaptshow);
	}

	public List findByOaptactuate(Object oaptactuate) {
		return findByProperty(OAPTACTUATE, oaptactuate);
	}

	public List findByOaptowns(Object oaptowns) {
		return findByProperty(OAPTOWNS, oaptowns);
	}

	public List findByOperationalStatusValue(Object operationalStatusValue) {
		return findByProperty(OPERATIONAL_STATUS_VALUE, operationalStatusValue);
	}

	public List findByOperationalStatusNilReason(Object operationalStatusNilReason) {
		return findByProperty(OPERATIONAL_STATUS_NIL_REASON, operationalStatusNilReason);
	}

	public List findAll() {
		log.debug("finding all IssuingairtrafficserviceunitAvailability instances");
		try {
			String queryString = "from IssuingairtrafficserviceunitAvailability";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IssuingairtrafficserviceunitAvailability merge(IssuingairtrafficserviceunitAvailability detachedInstance) {
		log.debug("merging IssuingairtrafficserviceunitAvailability instance");
		try {
			IssuingairtrafficserviceunitAvailability result = (IssuingairtrafficserviceunitAvailability) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IssuingairtrafficserviceunitAvailability instance) {
		log.debug("attaching dirty IssuingairtrafficserviceunitAvailability instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IssuingairtrafficserviceunitAvailability instance) {
		log.debug("attaching clean IssuingairtrafficserviceunitAvailability instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}