package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * IssuingairtrafficservicesunitPosition entities. Transaction control of the
 * save(), update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.wxxm.bean.IssuingairtrafficservicesunitPosition
 * @author MyEclipse Persistence Tools
 */
public class IssuingairtrafficservicesunitPositionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(IssuingairtrafficservicesunitPositionDAO.class);
	// property constants
	public static final String ELEVATION_VALUE = "elevationValue";
	public static final String ELEVATION_UOM = "elevationUom";
	public static final String ELEVATION_NIL_REASON = "elevationNilReason";
	public static final String GEOID_UNDULATION_VALUE = "geoidUndulationValue";
	public static final String GEOID_UNDULATION_UOM = "geoidUndulationUom";
	public static final String GEOID_UNDULATION_NIL_REASON = "geoidUndulationNilReason";
	public static final String VERTICAL_DATUM_VALUE = "verticalDatumValue";
	public static final String VERTICAL_DATUM_NIL_REASON = "verticalDatumNilReason";
	public static final String VERTICAL_ACCURACY_VALUE = "verticalAccuracyValue";
	public static final String VERTICAL_ACCURACY_UOM = "verticalAccuracyUom";
	public static final String VERTICAL_ACCURACY_NIL_REASON = "verticalAccuracyNilReason";

	public void save(IssuingairtrafficservicesunitPosition transientInstance) {
		log.debug("saving IssuingairtrafficservicesunitPosition instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IssuingairtrafficservicesunitPosition persistentInstance) {
		log.debug("deleting IssuingairtrafficservicesunitPosition instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IssuingairtrafficservicesunitPosition findById(java.lang.Integer id) {
		log.debug("getting IssuingairtrafficservicesunitPosition instance with id: " + id);
		try {
			IssuingairtrafficservicesunitPosition instance = (IssuingairtrafficservicesunitPosition) getSession()
					.get("com.wxxm.bean.IssuingairtrafficservicesunitPosition", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IssuingairtrafficservicesunitPosition instance) {
		log.debug("finding IssuingairtrafficservicesunitPosition instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.IssuingairtrafficservicesunitPosition")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding IssuingairtrafficservicesunitPosition instance with property: " + propertyName + ", value: "
				+ value);
		try {
			String queryString = "from IssuingairtrafficservicesunitPosition as model where model." + propertyName
					+ "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByElevationValue(Object elevationValue) {
		return findByProperty(ELEVATION_VALUE, elevationValue);
	}

	public List findByElevationUom(Object elevationUom) {
		return findByProperty(ELEVATION_UOM, elevationUom);
	}

	public List findByElevationNilReason(Object elevationNilReason) {
		return findByProperty(ELEVATION_NIL_REASON, elevationNilReason);
	}

	public List findByGeoidUndulationValue(Object geoidUndulationValue) {
		return findByProperty(GEOID_UNDULATION_VALUE, geoidUndulationValue);
	}

	public List findByGeoidUndulationUom(Object geoidUndulationUom) {
		return findByProperty(GEOID_UNDULATION_UOM, geoidUndulationUom);
	}

	public List findByGeoidUndulationNilReason(Object geoidUndulationNilReason) {
		return findByProperty(GEOID_UNDULATION_NIL_REASON, geoidUndulationNilReason);
	}

	public List findByVerticalDatumValue(Object verticalDatumValue) {
		return findByProperty(VERTICAL_DATUM_VALUE, verticalDatumValue);
	}

	public List findByVerticalDatumNilReason(Object verticalDatumNilReason) {
		return findByProperty(VERTICAL_DATUM_NIL_REASON, verticalDatumNilReason);
	}

	public List findByVerticalAccuracyValue(Object verticalAccuracyValue) {
		return findByProperty(VERTICAL_ACCURACY_VALUE, verticalAccuracyValue);
	}

	public List findByVerticalAccuracyUom(Object verticalAccuracyUom) {
		return findByProperty(VERTICAL_ACCURACY_UOM, verticalAccuracyUom);
	}

	public List findByVerticalAccuracyNilReason(Object verticalAccuracyNilReason) {
		return findByProperty(VERTICAL_ACCURACY_NIL_REASON, verticalAccuracyNilReason);
	}

	public List findAll() {
		log.debug("finding all IssuingairtrafficservicesunitPosition instances");
		try {
			String queryString = "from IssuingairtrafficservicesunitPosition";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IssuingairtrafficservicesunitPosition merge(IssuingairtrafficservicesunitPosition detachedInstance) {
		log.debug("merging IssuingairtrafficservicesunitPosition instance");
		try {
			IssuingairtrafficservicesunitPosition result = (IssuingairtrafficservicesunitPosition) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IssuingairtrafficservicesunitPosition instance) {
		log.debug("attaching dirty IssuingairtrafficservicesunitPosition instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IssuingairtrafficservicesunitPosition instance) {
		log.debug("attaching clean IssuingairtrafficservicesunitPosition instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}