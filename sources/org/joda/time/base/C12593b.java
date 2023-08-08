package org.joda.time.base;

import androidx.compose.p004ui.graphics.vector.C15369g;
import org.joda.convert.ToString;
import org.joda.time.C12711k;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.format.C12682h;

/* renamed from: org.joda.time.base.b */
public abstract class C12593b implements C12711k {
    /* renamed from: G */
    public Duration mo27858G() {
        return new Duration(mo28667k());
    }

    /* renamed from: G0 */
    public boolean mo28729G0(C12711k kVar) {
        if (kVar == null) {
            kVar = Duration.f30671a;
        }
        if (compareTo(kVar) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: V0 */
    public boolean mo28730V0(C12711k kVar) {
        if (kVar == null) {
            kVar = Duration.f30671a;
        }
        if (compareTo(kVar) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int compareTo(C12711k kVar) {
        int i = (mo28667k() > kVar.mo28667k() ? 1 : (mo28667k() == kVar.mo28667k() ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12711k)) {
            return false;
        }
        if (mo28667k() == ((C12711k) obj).mo28667k()) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public boolean mo28734g0(C12711k kVar) {
        if (kVar == null) {
            kVar = Duration.f30671a;
        }
        if (compareTo(kVar) < 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long k = mo28667k();
        return (int) (k ^ (k >>> 32));
    }

    /* renamed from: l */
    public Period mo28736l() {
        return new Period(mo28667k());
    }

    @ToString
    public String toString() {
        boolean z;
        int i;
        long k = mo28667k();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PT");
        if (k < 0) {
            z = true;
        } else {
            z = false;
        }
        C12682h.m54163h(stringBuffer, k);
        while (true) {
            int length = stringBuffer.length();
            if (z) {
                i = 7;
            } else {
                i = 6;
            }
            int i2 = 3;
            if (length >= i) {
                break;
            }
            if (!z) {
                i2 = 2;
            }
            stringBuffer.insert(i2, "0");
        }
        if ((k / 1000) * 1000 == k) {
            stringBuffer.setLength(stringBuffer.length() - 3);
        } else {
            stringBuffer.insert(stringBuffer.length() - 3, ".");
        }
        stringBuffer.append(C15369g.f37988n);
        return stringBuffer.toString();
    }
}
