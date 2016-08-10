package com.intel.swiss.sws.mechanism.enumutil;

/**
 * This interface should be implemented by enumerations which holds a unique number for each member (like in C/C++).
 * <code>EnumKeyChecker</code> can be used to check that the keys are unique
 * 
 * 
 * @author nambar
 */

public interface IUniqueKeyEnum<T>
{
	/**
	 * get the unique key of the enum value
	 */
	T getKey();
}
