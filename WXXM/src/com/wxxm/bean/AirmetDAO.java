package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Airmet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wxxm.bean.Airmet
 * @author MyEclipse Persistence Tools
 */
public class AirmetDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AirmetDAO.class);
	// property constants
	public static final String OWNS = "owns";
	public static final String NIL_REASON = "nilReason";
	public static final String REMOTE_SCHEMA = "remoteSchema";
	public static final String TYPE = "type";
	public static final String HREF = "href";
	public static final String ROLE = "role";
	public static final String ARCROLE = "arcrole";
	public static final String TITLE = "title";
	public static final String SHOW = "show";
	public static final String ACTUATE = "actuate";
	public static final String SEQUENCE_NUMBER = "sequenceNumber";
	public static final String CANCELLED_SEQUENCE_NUMBER = "cancelledSequenceNumber";
	public static final String SURFACE_VISIBILITYVALUE = "surfaceVisibilityvalue";
	public static final String SURFACE_VISIBILITYUOM = "surfaceVisibilityuom";
	public static final String SURFACE_WIND_SPEED_VALUE = "surfaceWindSpeedValue";
	public static final String SURFACE_WIND_SPEEDUOM = "surfaceWindSpeeduom";
	public static final String AIRMETREPORT_STATUS_TYPE = "airmetreportStatusType";

	public void save(Airmet transientInstance) {
		log.debug("saving Airmet instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Airmet persistentInstance) {
		log.debug("deleting Airmet instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Airmet findById(java.lang.Integer id) {
		log.debug("getting Airmet instance with id: " + id);
		try {
			Airmet instance = (Airmet) getSession().get("com.wxxm.bean.Airmet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Airmet instance) {
		log.debug("finding Airmet instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.Airmet").add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Airmet instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Airmet as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOwns(Object owns) {
		return findByProperty(OWNS, owns);
	}

	public List findByNilReason(Object nilReason) {
		return findByProperty(NIL_REASON, nilReason);
	}

	public List findByRemoteSchema(Object remoteSchema) {
		return findByProperty(REMOTE_SCHEMA, remoteSchema);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByHref(Object href) {
		return findByProperty(HREF, href);
	}

	public List findByRole(Object role) {
		return findByProperty(ROLE, role);
	}

	public List findByArcrole(Object arcrole) {
		return findByProperty(ARCROLE, arcrole);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByShow(Object show) {
		return findByProperty(SHOW, show);
	}

	public List findByActuate(Object actuate) {
		return findByProperty(ACTUATE, actuate);
	}

	public List findBySequenceNumber(Object sequenceNumber) {
		return findByProperty(SEQUENCE_NUMBER, sequenceNumber);
	}

	public List findByCancelledSequenceNumber(Object cancelledSequenceNumber) {
		return findByProperty(CANCELLED_SEQUENCE_NUMBER, cancelledSequenceNumber);
	}

	public List findBySurfaceVisibilityvalue(Object surfaceVisibilityvalue) {
		return findByProperty(SURFACE_VISIBILITYVALUE, surfaceVisibilityvalue);
	}

	public List findBySurfaceVisibilityuom(Object surfaceVisibilityuom) {
		return findByProperty(SURFACE_VISIBILITYUOM, surfaceVisibilityuom);
	}

	public List findBySurfaceWindSpeedValue(Object surfaceWindSpeedValue) {
		return findByProperty(SURFACE_WIND_SPEED_VALUE, surfaceWindSpeedValue);
	}

	public List findBySurfaceWindSpeeduom(Object surfaceWindSpeeduom) {
		return findByProperty(SURFACE_WIND_SPEEDUOM, surfaceWindSpeeduom);
	}

	public List findByAirmetreportStatusType(Object airmetreportStatusType) {
		return findByProperty(AIRMETREPORT_STATUS_TYPE, airmetreportStatusType);
	}

	public List findAll() {
		log.debug("finding all Airmet instances");
		try {
			String queryString = "from Airmet";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Airmet merge(Airmet detachedInstance) {
		log.debug("merging Airmet instance");
		try {
			Airmet result = (Airmet) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Airmet instance) {
		log.debug("attaching dirty Airmet instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Airmet instance) {
		log.debug("attaching clean Airmet instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}