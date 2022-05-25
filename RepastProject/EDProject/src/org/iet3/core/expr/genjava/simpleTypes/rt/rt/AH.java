package org.iet3.core.expr.genjava.simpleTypes.rt.rt;

/*Generated by MPS */

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AH {


  public static Number add(Number o1, Number o2) {
    if (o1 == null || o2 == null) {
      return null;
    }
    if (o1 instanceof BigInteger && o2 instanceof BigInteger) {
      return ((BigInteger) o1).add((BigInteger) o2);
    }
    if (o1 instanceof BigInteger && o2 instanceof BigDecimal) {
      return new BigDecimal(((BigInteger) o1)).add((BigDecimal) o2);
    }
    if (o1 instanceof BigDecimal && o2 instanceof BigInteger) {
      return ((BigDecimal) o1).add(new BigDecimal((BigInteger) o2));
    }
    if (o1 instanceof BigDecimal && o2 instanceof BigDecimal) {
      return ((BigDecimal) o1).add((BigDecimal) o2);
    }
    throw new IllegalArgumentException("Expected two numbers but was: " + o1.getClass() + " and " + o2.getClass());
  }

  public static String addString(String s1, String s2) {
    if (s1 == null || s2 == null) {
      return null;
    }
    return s1 + s2;
  }
  public static String addString(String s, Object o) {
    if (o == null) {
      return null;
    }
    return s + o.toString();
  }
  public static String addString(Object o, String s) {
    if (o == null) {
      return null;
    }
    return o.toString() + s;
  }

  public static Number sub(Number o1, Number o2) {
    if (o1 == null || o2 == null) {
      return null;
    }

    if (o1 instanceof BigInteger && o2 instanceof BigInteger) {
      return ((BigInteger) o1).subtract((BigInteger) o2);
    }
    if (o1 instanceof BigInteger && o2 instanceof BigDecimal) {
      return new BigDecimal(((BigInteger) o1)).subtract((BigDecimal) o2);
    }
    if (o1 instanceof BigDecimal && o2 instanceof BigInteger) {
      return ((BigDecimal) o1).subtract(new BigDecimal((BigInteger) o2));
    }
    if (o1 instanceof BigDecimal && o2 instanceof BigDecimal) {
      return ((BigDecimal) o1).subtract((BigDecimal) o2);
    }
    throw new IllegalArgumentException("Expected two numbers but was: " + o1.getClass() + " and " + o2.getClass());
  }



  public static Number mul(Number o1, Number o2) {
    if (o1 == null || o2 == null) {
      return null;
    }

    if (o1 instanceof BigInteger && o2 instanceof BigInteger) {
      return ((BigInteger) o1).multiply((BigInteger) o2);
    }
    if (o1 instanceof BigInteger && o2 instanceof BigDecimal) {
      return new BigDecimal(((BigInteger) o1)).multiply((BigDecimal) o2);
    }
    if (o1 instanceof BigDecimal && o2 instanceof BigInteger) {
      return ((BigDecimal) o1).multiply(new BigDecimal((BigInteger) o2));
    }
    if (o1 instanceof BigDecimal && o2 instanceof BigDecimal) {
      return ((BigDecimal) o1).multiply((BigDecimal) o2);
    }
    throw new IllegalArgumentException("Expected two numbers but was: " + o1.getClass() + " and " + o2.getClass());
  }
  public static Number div(Number o1, Number o2) {

    throw new IllegalArgumentException("Expected two numbers but was: " + o1.getClass() + " and " + o2.getClass());
  }

  public static int compare(Number n1, Number n2) {
    if (n1 instanceof BigInteger && n2 instanceof BigInteger) {
      return ((BigInteger) n1).compareTo(((BigInteger) n2));
    } else if (n1 instanceof BigDecimal && n2 instanceof BigDecimal) {
      return ((BigDecimal) n1).compareTo(((BigDecimal) n2));
    } else if (n1 instanceof BigDecimal && n2 instanceof BigInteger) {
      return ((BigDecimal) n1).compareTo(new BigDecimal(((BigInteger) n2)));
    } else if (n1 instanceof BigInteger && n2 instanceof BigDecimal) {
      return (new BigDecimal((BigInteger) n1)).compareTo((BigDecimal) n2);
    }
    throw new IllegalArgumentException("Expected two numbers but was: " + n1.getClass() + " and " + n2.getClass());

  }

  public static boolean isEqual(Number n1, Number n2) {
    return compare(new BigInteger(String.valueOf(n1)), new BigInteger(String.valueOf(n2))) == 0;
  }
  public static boolean isGreater(Number n1, Number n2) {
    return compare(new BigInteger(String.valueOf(n1)), new BigInteger(String.valueOf(n2))) > 0;
  }
  public static boolean isGreaterOrEqual(Number n1, Number n2) {
    return compare(new BigInteger(String.valueOf(n1)), new BigInteger(String.valueOf(n2))) >= 0;
  }

  public static boolean isLess(Number n1, Number n2) {
    return compare(new BigInteger(String.valueOf(n1)), new BigInteger(String.valueOf(n2))) < 0;
  }
  public static boolean isLessOrEqual(Number n1, Number n2) {
    return compare(new BigInteger(String.valueOf(n1)), new BigInteger(String.valueOf(n2))) <= 0;
  }


  public static BigInteger stringLength(String s) {
    if (s == null) {
      return null;
    }
    return BigInteger.valueOf(s.length());
  }
  public static BigInteger parseInteger(String s) {
    if (s == null) {
      return null;
    }
    return new BigInteger(s);
  }
  public static Number bounds(Number value, Number lowerBound, Number upperBound) {
    if (isLess(value, lowerBound)) {
      return lowerBound;
    } else if (isGreater(value, upperBound)) {
      return upperBound;
    } else {
      return value;
    }
  }
  public static Number round(Number value, int precision, RoundingMode mode) {
    if (!((value instanceof BigDecimal))) {
      return value;
    }

    return ((BigDecimal) value).setScale(precision, mode);
  }

  public static Number roundUp(Number value, Number precision) {
    return round(value, precision.intValue(), RoundingMode.UP);
  }
  public static Number roundDown(Number value, Number precision) {
    return round(value, precision.intValue(), RoundingMode.DOWN);
  }
  public static Number roundHalfUp(Number value, Number precision) {
    return round(value, precision.intValue(), RoundingMode.HALF_UP);
  }
  public static Number truncate(Number value, Number precision) {
    return roundDown(value, precision);
  }

  public static Number limit(Number value, Number lowerBound, Number upperBound) {
    if (isLess(value, lowerBound)) {
      return lowerBound;
    }
    if (isGreater(value, upperBound)) {
      return upperBound;
    }
    return value;
  }

  public static boolean oneOf(Number expr, Number... values) {
    for (Number v : values) {
      if (isEqual(expr, v)) {
        return true;
      }
    }
    return false;
  }

  public static boolean inRange(Number expr, Number lowerBound, boolean lowerExcluded, Number upperBound, boolean upperExcluded) {
    if (lowerExcluded) {
      if (isLessOrEqual(expr, lowerBound)) {
        return false;
      }
    } else {
      if (isLess(expr, lowerBound)) {
        return false;
      }
    }
    if (upperExcluded) {
      if (isGreaterOrEqual(expr, upperBound)) {
        return false;
      }
    } else {
      if (isGreater(expr, upperBound)) {
        return false;
      }
    }
    return true;
  }

  public static boolean equalsWithTolerance(Number left, Number base, Number tol) {
    Number lower = AH.sub(base, tol);
    Number upper = AH.add(base, tol);
    return AH.inRange(left, lower, false, upper, false);
  }




}
