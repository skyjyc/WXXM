package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * ValidperiodEnd entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wxxm.bean.ValidperiodEnd
 * @author MyEclipse Persistence Tools
 */
public class ValidperiodEndDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ValidperiodEndDAO.class);
	// property constants
	public static final String END_POSITION_VALUE = "endPositionValue";
	public static final String END_POSITION_FRAME = "endPositionFrame";
	public static final String END_POSITION_CALENDAR_ERA_NAME = "endPositionCalendarEraName";
	public static final String END_POSITIONINDETERMINATE_POSITION = "endPositionindeterminatePosition";
	public static final String END_VALUE = "endValue";
	public static final String END_FRAME = "endFrame";
	public static final String END_CALENDAR_ERA_NAME = "endCalendarEraName";
	public static final String END_INDETERMINATE_POSITION = "endIndeterminatePosition";
	public static final String END_OWNS = "endOwns";
	public static final String END_NIL_REASON = "endNilReason";
	public static final String ENDREMOTE_SCHEMA = "endremoteSchema";
	public static final String END_TYPE = "endType";
	public static final String END_HREF = "endHref";
	public static final String END_ROLE = "endRole";
	public static final String END_ARCTOLE = "endArctole";
	public static final String END_TITLE = "endTitle";
	public static final String BEGIN_SHOW = "beginShow";
	public static final String ENDACTUATE = "endactuate";

	public void save(ValidperiodEnd transientInstance) {
		log.debug("saving ValidperiodEnd instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ValidperiodEnd persistentInstance) {
		log.debug("deleting ValidperiodEnd instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ValidperiodEnd findById(java.lang.Integer id) {
		log.debug("getting ValidperiodEnd instance with id: " + id);
		try {
			ValidperiodEnd instance = (ValidperiodEnd) getSession().get("com.wxxm.bean.ValidperiodEnd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ValidperiodEnd instance) {
		log.debug("finding ValidperiodEnd instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.ValidperiodEnd").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ValidperiodEnd instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from ValidperiodEnd as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEndPositionValue(Object endPositionValue) {
		return findByProperty(END_POSITION_VALUE, endPositionValue);
	}

	public List findByEndPositionFrame(Object endPositionFrame) {
		return findByProperty(END_POSITION_FRAME, endPositionFrame);
	}

	public List findByEndPositionCalendarEraName(Object endPositionCalendarEraName) {
		return findByProperty(END_POSITION_CALENDAR_ERA_NAME, endPositionCalendarEraName);
	}

	public List findByEndPositionindeterminatePosition(Object endPositionindeterminatePosition) {
		return findByProperty(END_POSITIONINDETERMINATE_POSITION, endPositionindeterminatePosition);
	}

	public List findByEndValue(Object endValue) {
		return findByProperty(END_VALUE, endValue);
	}

	public List findByEndFrame(Object endFrame) {
		return findByProperty(END_FRAME, endFrame);
	}

	public List findByEndCalendarEraName(Object endCalendarEraName) {
		return findByProperty(END_CALENDAR_ERA_NAME, endCalendarEraName);
	}

	public List findByEndIndeterminatePosition(Object endIndeterminatePosition) {
		return findByProperty(END_INDETERMINATE_POSITION, endIndeterminatePosition);
	}

	public List findByEndOwns(Object endOwns) {
		return findByProperty(END_OWNS, endOwns);
	}

	public List findByEndNilReason(Object endNilReason) {
		return findByProperty(END_NIL_REASON, endNilReason);
	}

	public List findByEndremoteSchema(Object endremoteSchema) {
		return findByProperty(ENDREMOTE_SCHEMA, endremoteSchema);
	}

	public List findByEndType(Object endType) {
		return findByProperty(END_TYPE, endType);
	}

	public List findByEndHref(Object endHref) {
		return findByProperty(END_HREF, endHref);
	}

	public List findByEndRole(Object endRole) {
		return findByProperty(END_ROLE, endRole);
	}

	public List findByEndArctole(Object endArctole) {
		return findByProperty(END_ARCTOLE, endArctole);
	}

	public List findByEndTitle(Object endTitle) {
		return findByProperty(END_TITLE, endTitle);
	}

	public List findByBeginShow(Object beginShow) {
		return findByProperty(BEGIN_SHOW, beginShow);
	}

	public List findByEndactuate(Object endactuate) {
		return findByProperty(ENDACTUATE, endactuate);
	}

	public List findAll() {
		log.debug("finding all ValidperiodEnd instances");
		try {
			String queryString = "from ValidperiodEnd";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ValidperiodEnd merge(ValidperiodEnd detachedInstance) {
		log.debug("merging ValidperiodEnd instance");
		try {
			ValidperiodEnd result = (ValidperiodEnd) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ValidperiodEnd instance) {
		log.debug("attaching dirty ValidperiodEnd instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ValidperiodEnd instance) {
		log.debug("attaching clean ValidperiodEnd instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}