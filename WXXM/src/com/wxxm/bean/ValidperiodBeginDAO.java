package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * ValidperiodBegin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wxxm.bean.ValidperiodBegin
 * @author MyEclipse Persistence Tools
 */
public class ValidperiodBeginDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ValidperiodBeginDAO.class);
	// property constants
	public static final String BEGIN_POSITION_VALUE = "beginPositionValue";
	public static final String BEGIN_POSITION_FRAME = "beginPositionFrame";
	public static final String BEGIN_POSITION_CALENDAR_ERA_NAME = "beginPositionCalendarEraName";
	public static final String BEGIN_POSITIONINDETERMINATE_POSITION = "beginPositionindeterminatePosition";
	public static final String BEGIN_VALUE = "beginValue";
	public static final String BEGI_FRAME = "begiFrame";
	public static final String BEGIN_CALENDAR_ERA_NAME = "beginCalendarEraName";
	public static final String BEGIN_INDETERMINATE_POSITION = "beginIndeterminatePosition";
	public static final String BEGIN_OWNS = "beginOwns";
	public static final String BEGIN_NIL_REASON = "beginNilReason";
	public static final String BEGINREMOTE_SCHEMA = "beginremoteSchema";
	public static final String BEGIN_TYPE = "beginType";
	public static final String BEGIN_HREF = "beginHref";
	public static final String BEGIN_ROLE = "beginRole";
	public static final String BEGIN_ARCTOLE = "beginArctole";
	public static final String BEGIN_TITLE = "beginTitle";
	public static final String BEGIN_SHOW = "beginShow";
	public static final String BEGINACTUATE = "beginactuate";

	public void save(ValidperiodBegin transientInstance) {
		log.debug("saving ValidperiodBegin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ValidperiodBegin persistentInstance) {
		log.debug("deleting ValidperiodBegin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ValidperiodBegin findById(java.lang.Integer id) {
		log.debug("getting ValidperiodBegin instance with id: " + id);
		try {
			ValidperiodBegin instance = (ValidperiodBegin) getSession().get("com.wxxm.bean.ValidperiodBegin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ValidperiodBegin instance) {
		log.debug("finding ValidperiodBegin instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.ValidperiodBegin").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ValidperiodBegin instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ValidperiodBegin as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBeginPositionValue(Object beginPositionValue) {
		return findByProperty(BEGIN_POSITION_VALUE, beginPositionValue);
	}

	public List findByBeginPositionFrame(Object beginPositionFrame) {
		return findByProperty(BEGIN_POSITION_FRAME, beginPositionFrame);
	}

	public List findByBeginPositionCalendarEraName(Object beginPositionCalendarEraName) {
		return findByProperty(BEGIN_POSITION_CALENDAR_ERA_NAME, beginPositionCalendarEraName);
	}

	public List findByBeginPositionindeterminatePosition(Object beginPositionindeterminatePosition) {
		return findByProperty(BEGIN_POSITIONINDETERMINATE_POSITION, beginPositionindeterminatePosition);
	}

	public List findByBeginValue(Object beginValue) {
		return findByProperty(BEGIN_VALUE, beginValue);
	}

	public List findByBegiFrame(Object begiFrame) {
		return findByProperty(BEGI_FRAME, begiFrame);
	}

	public List findByBeginCalendarEraName(Object beginCalendarEraName) {
		return findByProperty(BEGIN_CALENDAR_ERA_NAME, beginCalendarEraName);
	}

	public List findByBeginIndeterminatePosition(Object beginIndeterminatePosition) {
		return findByProperty(BEGIN_INDETERMINATE_POSITION, beginIndeterminatePosition);
	}

	public List findByBeginOwns(Object beginOwns) {
		return findByProperty(BEGIN_OWNS, beginOwns);
	}

	public List findByBeginNilReason(Object beginNilReason) {
		return findByProperty(BEGIN_NIL_REASON, beginNilReason);
	}

	public List findByBeginremoteSchema(Object beginremoteSchema) {
		return findByProperty(BEGINREMOTE_SCHEMA, beginremoteSchema);
	}

	public List findByBeginType(Object beginType) {
		return findByProperty(BEGIN_TYPE, beginType);
	}

	public List findByBeginHref(Object beginHref) {
		return findByProperty(BEGIN_HREF, beginHref);
	}

	public List findByBeginRole(Object beginRole) {
		return findByProperty(BEGIN_ROLE, beginRole);
	}

	public List findByBeginArctole(Object beginArctole) {
		return findByProperty(BEGIN_ARCTOLE, beginArctole);
	}

	public List findByBeginTitle(Object beginTitle) {
		return findByProperty(BEGIN_TITLE, beginTitle);
	}

	public List findByBeginShow(Object beginShow) {
		return findByProperty(BEGIN_SHOW, beginShow);
	}

	public List findByBeginactuate(Object beginactuate) {
		return findByProperty(BEGINACTUATE, beginactuate);
	}

	public List findAll() {
		log.debug("finding all ValidperiodBegin instances");
		try {
			String queryString = "from ValidperiodBegin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ValidperiodBegin merge(ValidperiodBegin detachedInstance) {
		log.debug("merging ValidperiodBegin instance");
		try {
			ValidperiodBegin result = (ValidperiodBegin) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ValidperiodBegin instance) {
		log.debug("attaching dirty ValidperiodBegin instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ValidperiodBegin instance) {
		log.debug("attaching clean ValidperiodBegin instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}