package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.gson.o */
public final class C33703o extends C33699k {

    /* renamed from: b */
    public static final Class<?>[] f81820b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    public Object f81821a;

    public C33703o(Boolean bool) {
        mo97808t0(bool);
    }

    /* renamed from: o0 */
    public static boolean m135504o0(C33703o oVar) {
        Object obj = oVar.f81821a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public static boolean m135505r0(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f81820b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public float mo97528A() {
        return mo97806p0() ? mo97532e0().floatValue() : Float.parseFloat(mo97536h0());
    }

    /* renamed from: H */
    public int mo97529H() {
        return mo97806p0() ? mo97532e0().intValue() : Integer.parseInt(mo97536h0());
    }

    /* renamed from: Y */
    public long mo97530Y() {
        return mo97806p0() ? mo97532e0().longValue() : Long.parseLong(mo97536h0());
    }

    /* renamed from: e0 */
    public Number mo97532e0() {
        Object obj = this.f81821a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33703o.class != obj.getClass()) {
            return false;
        }
        C33703o oVar = (C33703o) obj;
        if (this.f81821a == null) {
            if (oVar.f81821a == null) {
                return true;
            }
            return false;
        } else if (!m135504o0(this) || !m135504o0(oVar)) {
            Object obj2 = this.f81821a;
            if (!(obj2 instanceof Number) || !(oVar.f81821a instanceof Number)) {
                return obj2.equals(oVar.f81821a);
            }
            double doubleValue = mo97532e0().doubleValue();
            double doubleValue2 = oVar.mo97532e0().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (mo97532e0().longValue() == oVar.mo97532e0().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f0 */
    public short mo97534f0() {
        return mo97806p0() ? mo97532e0().shortValue() : Short.parseShort(mo97536h0());
    }

    /* renamed from: h */
    public BigDecimal mo97535h() {
        Object obj = this.f81821a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f81821a.toString());
    }

    /* renamed from: h0 */
    public String mo97536h0() {
        if (mo97806p0()) {
            return mo97532e0().toString();
        }
        if (mo97805n0()) {
            return mo97776q().toString();
        }
        return (String) this.f81821a;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f81821a == null) {
            return 31;
        }
        if (m135504o0(this)) {
            doubleToLongBits = mo97532e0().longValue();
        } else {
            Object obj = this.f81821a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo97532e0().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public BigInteger mo97538i() {
        Object obj = this.f81821a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return new BigInteger(this.f81821a.toString());
    }

    /* renamed from: k */
    public boolean mo97540k() {
        if (mo97805n0()) {
            return mo97776q().booleanValue();
        }
        return Boolean.parseBoolean(mo97536h0());
    }

    /* renamed from: m0 */
    public C33703o mo97531e() {
        return this;
    }

    /* renamed from: n0 */
    public boolean mo97805n0() {
        return this.f81821a instanceof Boolean;
    }

    /* renamed from: p0 */
    public boolean mo97806p0() {
        return this.f81821a instanceof Number;
    }

    /* renamed from: q */
    public Boolean mo97776q() {
        return (Boolean) this.f81821a;
    }

    /* renamed from: r */
    public byte mo97545r() {
        return mo97806p0() ? mo97532e0().byteValue() : Byte.parseByte(mo97536h0());
    }

    /* renamed from: s0 */
    public boolean mo97807s0() {
        return this.f81821a instanceof String;
    }

    /* renamed from: t0 */
    public void mo97808t0(Object obj) {
        boolean z;
        if (obj instanceof Character) {
            this.f81821a = String.valueOf(((Character) obj).charValue());
            return;
        }
        if ((obj instanceof Number) || m135505r0(obj)) {
            z = true;
        } else {
            z = false;
        }
        C$Gson$Preconditions.checkArgument(z);
        this.f81821a = obj;
    }

    /* renamed from: w */
    public char mo97552w() {
        return mo97536h0().charAt(0);
    }

    /* renamed from: y */
    public double mo97554y() {
        return mo97806p0() ? mo97532e0().doubleValue() : Double.parseDouble(mo97536h0());
    }

    public C33703o(Number number) {
        mo97808t0(number);
    }

    public C33703o(String str) {
        mo97808t0(str);
    }

    public C33703o(Character ch) {
        mo97808t0(ch);
    }

    public C33703o(Object obj) {
        mo97808t0(obj);
    }
}
