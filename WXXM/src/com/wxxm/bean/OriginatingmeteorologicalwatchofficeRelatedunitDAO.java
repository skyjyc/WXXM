package com.wxxm.bean;

import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * OriginatingmeteorologicalwatchofficeRelatedunit entities. Transaction control
 * of the save(), update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.wxxm.bean.OriginatingmeteorologicalwatchofficeRelatedunit
 * @author MyEclipse Persistence Tools
 */
public class OriginatingmeteorologicalwatchofficeRelatedunitDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(OriginatingmeteorologicalwatchofficeRelatedunitDAO.class);
	// property constants
	public static final String TYPE_VALUE = "typeValue";
	public static final String TYPENIL_REASON = "typenilReason";
	public static final String NIL_REASON = "nilReason";
	public static final String REMOTE_SCHEMA = "remoteSchema";
	public static final String TYPE = "type";
	public static final String HREF = "href";
	public static final String ROLE = "role";
	public static final String ARCROLE = "arcrole";
	public static final String SHOW = "show";
	public static final String OWNS = "owns";

	public void save(OriginatingmeteorologicalwatchofficeRelatedunit transientInstance) {
		log.debug("saving OriginatingmeteorologicalwatchofficeRelatedunit instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(OriginatingmeteorologicalwatchofficeRelatedunit persistentInstance) {
		log.debug("deleting OriginatingmeteorologicalwatchofficeRelatedunit instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OriginatingmeteorologicalwatchofficeRelatedunit findById(java.lang.Integer id) {
		log.debug("getting OriginatingmeteorologicalwatchofficeRelatedunit instance with id: " + id);
		try {
			OriginatingmeteorologicalwatchofficeRelatedunit instance = (OriginatingmeteorologicalwatchofficeRelatedunit) getSession()
					.get("com.wxxm.bean.OriginatingmeteorologicalwatchofficeRelatedunit", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OriginatingmeteorologicalwatchofficeRelatedunit instance) {
		log.debug("finding OriginatingmeteorologicalwatchofficeRelatedunit instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.OriginatingmeteorologicalwatchofficeRelatedunit")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding OriginatingmeteorologicalwatchofficeRelatedunit instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from OriginatingmeteorologicalwatchofficeRelatedunit as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTypeValue(Object typeValue) {
		return findByProperty(TYPE_VALUE, typeValue);
	}

	public List findByTypenilReason(Object typenilReason) {
		return findByProperty(TYPENIL_REASON, typenilReason);
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

	public List findByShow(Object show) {
		return findByProperty(SHOW, show);
	}

	public List findByOwns(Object owns) {
		return findByProperty(OWNS, owns);
	}

	public List findAll() {
		log.debug("finding all OriginatingmeteorologicalwatchofficeRelatedunit instances");
		try {
			String queryString = "from OriginatingmeteorologicalwatchofficeRelatedunit";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public OriginatingmeteorologicalwatchofficeRelatedunit merge(
			OriginatingmeteorologicalwatchofficeRelatedunit detachedInstance) {
		log.debug("merging OriginatingmeteorologicalwatchofficeRelatedunit instance");
		try {
			OriginatingmeteorologicalwatchofficeRelatedunit result = (OriginatingmeteorologicalwatchofficeRelatedunit) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(OriginatingmeteorologicalwatchofficeRelatedunit instance) {
		log.debug("attaching dirty OriginatingmeteorologicalwatchofficeRelatedunit instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OriginatingmeteorologicalwatchofficeRelatedunit instance) {
		log.debug("attaching clean OriginatingmeteorologicalwatchofficeRelatedunit instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}