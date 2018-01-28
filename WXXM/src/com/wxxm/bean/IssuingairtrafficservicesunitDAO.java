package com.wxxm.bean;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Issuingairtrafficservicesunit entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.wxxm.bean.Issuingairtrafficservicesunit
 * @author MyEclipse Persistence Tools
 */
public class IssuingairtrafficservicesunitDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(IssuingairtrafficservicesunitDAO.class);
	// property constants
	public static final String UNIT_NAMEVALUE = "unitNamevalue";
	public static final String UNIT_NAMENIL_REASON = "unitNamenilReason";
	public static final String TYPEVALUE = "typevalue";
	public static final String TYPENIL_REASON = "typenilReason";
	public static final String COMPLIANT_ICAOVALUE = "compliantIcaovalue";
	public static final String COMPLIANT_ICAONIL_REASON = "compliantIcaonilReason";
	public static final String DESIGNATORVALUE = "designatorvalue";
	public static final String DESIGNATORNIL_REASON = "designatornilReason";
	public static final String MILITARYVALUE = "militaryvalue";
	public static final String MILITARYNIL_REASON = "militarynilReason";
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
	public static final String UNIT_TYPEOWNS = "unitTypeowns";

	public void save(Issuingairtrafficservicesunit transientInstance) {
		log.debug("saving Issuingairtrafficservicesunit instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Issuingairtrafficservicesunit persistentInstance) {
		log.debug("deleting Issuingairtrafficservicesunit instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Issuingairtrafficservicesunit findById(java.lang.Integer id) {
		log.debug("getting Issuingairtrafficservicesunit instance with id: " + id);
		try {
			Issuingairtrafficservicesunit instance = (Issuingairtrafficservicesunit) getSession()
					.get("com.wxxm.bean.Issuingairtrafficservicesunit", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Issuingairtrafficservicesunit instance) {
		log.debug("finding Issuingairtrafficservicesunit instance by example");
		try {
			List results = getSession().createCriteria("com.wxxm.bean.Issuingairtrafficservicesunit")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug(
				"finding Issuingairtrafficservicesunit instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Issuingairtrafficservicesunit as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUnitNamevalue(Object unitNamevalue) {
		return findByProperty(UNIT_NAMEVALUE, unitNamevalue);
	}

	public List findByUnitNamenilReason(Object unitNamenilReason) {
		return findByProperty(UNIT_NAMENIL_REASON, unitNamenilReason);
	}

	public List findByTypevalue(Object typevalue) {
		return findByProperty(TYPEVALUE, typevalue);
	}

	public List findByTypenilReason(Object typenilReason) {
		return findByProperty(TYPENIL_REASON, typenilReason);
	}

	public List findByCompliantIcaovalue(Object compliantIcaovalue) {
		return findByProperty(COMPLIANT_ICAOVALUE, compliantIcaovalue);
	}

	public List findByCompliantIcaonilReason(Object compliantIcaonilReason) {
		return findByProperty(COMPLIANT_ICAONIL_REASON, compliantIcaonilReason);
	}

	public List findByDesignatorvalue(Object designatorvalue) {
		return findByProperty(DESIGNATORVALUE, designatorvalue);
	}

	public List findByDesignatornilReason(Object designatornilReason) {
		return findByProperty(DESIGNATORNIL_REASON, designatornilReason);
	}

	public List findByMilitaryvalue(Object militaryvalue) {
		return findByProperty(MILITARYVALUE, militaryvalue);
	}

	public List findByMilitarynilReason(Object militarynilReason) {
		return findByProperty(MILITARYNIL_REASON, militarynilReason);
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

	public List findByUnitTypeowns(Object unitTypeowns) {
		return findByProperty(UNIT_TYPEOWNS, unitTypeowns);
	}

	public List findAll() {
		log.debug("finding all Issuingairtrafficservicesunit instances");
		try {
			String queryString = "from Issuingairtrafficservicesunit";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Issuingairtrafficservicesunit merge(Issuingairtrafficservicesunit detachedInstance) {
		log.debug("merging Issuingairtrafficservicesunit instance");
		try {
			Issuingairtrafficservicesunit result = (Issuingairtrafficservicesunit) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Issuingairtrafficservicesunit instance) {
		log.debug("attaching dirty Issuingairtrafficservicesunit instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Issuingairtrafficservicesunit instance) {
		log.debug("attaching clean Issuingairtrafficservicesunit instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}