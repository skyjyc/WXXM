package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * IssuingairtrafficservicesunitContact entities. Transaction control of the
 * save(), update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.wxxm.bean.IssuingairtrafficservicesunitContact
 * @author MyEclipse Persistence Tools
 */
public class IssuingairtrafficservicesunitContactDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(IssuingairtrafficservicesunitContactDAO.class);
	// property constants
	public static final String CONTACT_INFORMATION_NAME_VALUE = "contactInformationNameValue";
	public static final String CONTACT_INFORMATION_NAME_NIL_REASON = "contactInformationNameNilReason";
	public static final String TITLE_VALUE = "titleValue";
	public static final String TITLE_NIL_REASON = "titleNilReason";

	public void save(IssuingairtrafficservicesunitContact transientInstance) {
		log.debug("saving IssuingairtrafficservicesunitContact instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IssuingairtrafficservicesunitContact persistentInstance) {
		log.debug("deleting IssuingairtrafficservicesunitContact instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IssuingairtrafficservicesunitContact findById(java.lang.Integer id) {
		log.debug("getting IssuingairtrafficservicesunitContact instance with id: " + id);
		try {
			IssuingairtrafficservicesunitContact instance = (IssuingairtrafficservicesunitContact) getSession()
					.get("com.wxxm.bean.IssuingairtrafficservicesunitContact", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IssuingairtrafficservicesunitContact instance) {
		log.debug("finding IssuingairtrafficservicesunitContact instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.IssuingairtrafficservicesunitContact")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IssuingairtrafficservicesunitContact instance with property: " + propertyName + ", value: "
				+ value);
		try {
			String queryString = "from IssuingairtrafficservicesunitContact as model where model." + propertyName
					+ "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByContactInformationNameValue(Object contactInformationNameValue) {
		return findByProperty(CONTACT_INFORMATION_NAME_VALUE, contactInformationNameValue);
	}

	public List findByContactInformationNameNilReason(Object contactInformationNameNilReason) {
		return findByProperty(CONTACT_INFORMATION_NAME_NIL_REASON, contactInformationNameNilReason);
	}

	public List findByTitleValue(Object titleValue) {
		return findByProperty(TITLE_VALUE, titleValue);
	}

	public List findByTitleNilReason(Object titleNilReason) {
		return findByProperty(TITLE_NIL_REASON, titleNilReason);
	}

	public List findAll() {
		log.debug("finding all IssuingairtrafficservicesunitContact instances");
		try {
			String queryString = "from IssuingairtrafficservicesunitContact";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IssuingairtrafficservicesunitContact merge(IssuingairtrafficservicesunitContact detachedInstance) {
		log.debug("merging IssuingairtrafficservicesunitContact instance");
		try {
			IssuingairtrafficservicesunitContact result = (IssuingairtrafficservicesunitContact) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IssuingairtrafficservicesunitContact instance) {
		log.debug("attaching dirty IssuingairtrafficservicesunitContact instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IssuingairtrafficservicesunitContact instance) {
		log.debug("attaching clean IssuingairtrafficservicesunitContact instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}