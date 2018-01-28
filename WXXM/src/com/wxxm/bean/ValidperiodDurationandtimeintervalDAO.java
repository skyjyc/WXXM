package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * ValidperiodDurationandtimeinterval entities. Transaction control of the
 * save(), update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.wxxm.bean.ValidperiodDurationandtimeinterval
 * @author MyEclipse Persistence Tools
 */
public class ValidperiodDurationandtimeintervalDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ValidperiodDurationandtimeintervalDAO.class);
	// property constants
	public static final String DURATION = "duration";
	public static final String TIME_INTERVAL_VALUE = "timeIntervalValue";
	public static final String TIME_INTERVAL_UNIT = "timeIntervalUnit";
	public static final String TIME_INTERVAL_VALUE_RADIX = "timeIntervalValueRadix";
	public static final String TIME_INTERVAL_FACTOR = "timeIntervalFactor";

	public void save(ValidperiodDurationandtimeinterval transientInstance) {
		log.debug("saving ValidperiodDurationandtimeinterval instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ValidperiodDurationandtimeinterval persistentInstance) {
		log.debug("deleting ValidperiodDurationandtimeinterval instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ValidperiodDurationandtimeinterval findById(java.lang.Integer id) {
		log.debug("getting ValidperiodDurationandtimeinterval instance with id: " + id);
		try {
			ValidperiodDurationandtimeinterval instance = (ValidperiodDurationandtimeinterval) getSession()
					.get("com.wxxm.bean.ValidperiodDurationandtimeinterval", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ValidperiodDurationandtimeinterval instance) {
		log.debug("finding ValidperiodDurationandtimeinterval instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.ValidperiodDurationandtimeinterval")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ValidperiodDurationandtimeinterval instance with property: " + propertyName + ", value: "
				+ value);
		try {
			String queryString = "from ValidperiodDurationandtimeinterval as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDuration(Object duration) {
		return findByProperty(DURATION, duration);
	}

	public List findByTimeIntervalValue(Object timeIntervalValue) {
		return findByProperty(TIME_INTERVAL_VALUE, timeIntervalValue);
	}

	public List findByTimeIntervalUnit(Object timeIntervalUnit) {
		return findByProperty(TIME_INTERVAL_UNIT, timeIntervalUnit);
	}

	public List findByTimeIntervalValueRadix(Object timeIntervalValueRadix) {
		return findByProperty(TIME_INTERVAL_VALUE_RADIX, timeIntervalValueRadix);
	}

	public List findByTimeIntervalFactor(Object timeIntervalFactor) {
		return findByProperty(TIME_INTERVAL_FACTOR, timeIntervalFactor);
	}

	public List findAll() {
		log.debug("finding all ValidperiodDurationandtimeinterval instances");
		try {
			String queryString = "from ValidperiodDurationandtimeinterval";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ValidperiodDurationandtimeinterval merge(ValidperiodDurationandtimeinterval detachedInstance) {
		log.debug("merging ValidperiodDurationandtimeinterval instance");
		try {
			ValidperiodDurationandtimeinterval result = (ValidperiodDurationandtimeinterval) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ValidperiodDurationandtimeinterval instance) {
		log.debug("attaching dirty ValidperiodDurationandtimeinterval instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ValidperiodDurationandtimeinterval instance) {
		log.debug("attaching clean ValidperiodDurationandtimeinterval instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}