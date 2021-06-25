/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class StdOptionalDouble {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StdOptionalDouble(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StdOptionalDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_StdOptionalDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdOptionalDouble() {
    this(AdaptiveCardObjectModelJNI.new_StdOptionalDouble__SWIG_0(), true);
  }

  public StdOptionalDouble(double arg0) {
    this(AdaptiveCardObjectModelJNI.new_StdOptionalDouble__SWIG_1(arg0), true);
  }

  public boolean has_value() {
    return AdaptiveCardObjectModelJNI.StdOptionalDouble_has_value(swigCPtr, this);
  }

  public double value() {
    return AdaptiveCardObjectModelJNI.StdOptionalDouble_value(swigCPtr, this);
  }

}