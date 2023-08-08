package org.joda.time.format;

import androidx.compose.foundation.text.C2765d;
import com.google.android.material.slider.C31570c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.C12361b;
import okhttp3.internal.connection.RealConnection;
import org.joda.time.C12589a;
import org.joda.time.C12599c;
import org.joda.time.C12641d;
import org.joda.time.C12714n;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.field.C12654g;
import org.joda.time.field.MillisDurationField;

public class DateTimeFormatterBuilder {

    /* renamed from: a */
    public ArrayList<Object> f31157a = new ArrayList<>();

    /* renamed from: b */
    public Object f31158b;

    public enum TimeZoneId implements C12688m, C12686k {
        INSTANCE;
        

        /* renamed from: b */
        public static final List<String> f31160b = null;

        /* renamed from: c */
        public static final Map<String, List<String>> f31161c = null;

        /* renamed from: d */
        public static final List<String> f31162d = null;

        /* renamed from: e */
        public static final int f31163e = 0;

        /* renamed from: f */
        public static final int f31164f = 0;

        /* access modifiers changed from: public */
        static {
            f31162d = new ArrayList();
            ArrayList<String> arrayList = new ArrayList<>(DateTimeZone.m51372l());
            f31160b = arrayList;
            Collections.sort(arrayList);
            f31161c = new HashMap();
            int i = 0;
            int i2 = 0;
            for (String str : arrayList) {
                int indexOf = str.indexOf(47);
                if (indexOf >= 0) {
                    if (indexOf < str.length()) {
                        indexOf++;
                    }
                    i2 = Math.max(i2, indexOf);
                    String substring = str.substring(0, indexOf + 1);
                    String substring2 = str.substring(indexOf);
                    Map<String, List<String>> map = f31161c;
                    if (!map.containsKey(substring)) {
                        map.put(substring, new ArrayList());
                    }
                    map.get(substring).add(substring2);
                } else {
                    f31162d.add(str);
                }
                i = Math.max(i, str.length());
            }
            f31163e = i;
            f31164f = i2;
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            String str;
            int i2;
            String str2;
            List<String> list = f31162d;
            int length = charSequence.length();
            int min = Math.min(length, f31164f + i);
            int i3 = i;
            while (true) {
                if (i3 >= min) {
                    str = "";
                    i2 = i;
                    break;
                } else if (charSequence.charAt(i3) == '/') {
                    int i4 = i3 + 1;
                    str = charSequence.subSequence(i, i4).toString();
                    i2 = str.length() + i;
                    if (i3 < length) {
                        str2 = str + charSequence.charAt(i4);
                    } else {
                        str2 = str;
                    }
                    list = f31161c.get(str2);
                    if (list == null) {
                        return ~i;
                    }
                } else {
                    i3++;
                }
            }
            String str3 = null;
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str4 = list.get(i5);
                if (DateTimeFormatterBuilder.m53881o0(charSequence, i2, str4) && (str3 == null || str4.length() > str3.length())) {
                    str3 = str4;
                }
            }
            if (str3 == null) {
                return ~i;
            }
            dVar.mo29272G(DateTimeZone.m51367g(str + str3));
            return i2 + str3.length();
        }

        /* renamed from: g */
        public int mo29197g() {
            return f31163e;
        }

        /* renamed from: q */
        public int mo29198q() {
            return f31163e;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.mo27824q() : "");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$a */
    public static class C12658a implements C12688m, C12686k {

        /* renamed from: a */
        public final char f31166a;

        public C12658a(char c) {
            this.f31166a = c;
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            char c = this.f31166a;
            if (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
                return i + 1;
            }
            return ~i;
        }

        /* renamed from: g */
        public int mo29197g() {
            return 1;
        }

        /* renamed from: q */
        public int mo29198q() {
            return 1;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            appendable.append(this.f31166a);
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f31166a);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$b */
    public static class C12659b implements C12688m, C12686k {

        /* renamed from: a */
        public final C12688m[] f31167a;

        /* renamed from: b */
        public final C12686k[] f31168b;

        /* renamed from: c */
        public final int f31169c;

        /* renamed from: d */
        public final int f31170d;

        public C12659b(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            mo29202c(list, arrayList, arrayList2);
            if (arrayList.contains((Object) null) || arrayList.isEmpty()) {
                this.f31167a = null;
                this.f31169c = 0;
            } else {
                int size = arrayList.size();
                this.f31167a = new C12688m[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C12688m mVar = (C12688m) arrayList.get(i2);
                    i += mVar.mo29198q();
                    this.f31167a[i2] = mVar;
                }
                this.f31169c = i;
            }
            if (arrayList2.contains((Object) null) || arrayList2.isEmpty()) {
                this.f31168b = null;
                this.f31170d = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.f31168b = new C12686k[size2];
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                C12686k kVar = (C12686k) arrayList2.get(i4);
                i3 += kVar.mo29197g();
                this.f31168b[i4] = kVar;
            }
            this.f31170d = i3;
        }

        /* renamed from: a */
        public final void mo29201a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            C12686k[] kVarArr = this.f31168b;
            if (kVarArr != null) {
                int length = kVarArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = kVarArr[i2].mo29196b(dVar, charSequence, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public final void mo29202c(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C12659b) {
                    mo29201a(list2, ((C12659b) obj).f31167a);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof C12659b) {
                    mo29201a(list3, ((C12659b) obj2).f31168b);
                } else {
                    list3.add(obj2);
                }
            }
        }

        /* renamed from: d */
        public boolean mo29203d() {
            return this.f31168b != null;
        }

        /* renamed from: e */
        public boolean mo29204e() {
            return this.f31167a != null;
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31170d;
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31169c;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            C12688m[] mVarArr = this.f31167a;
            if (mVarArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (C12688m w : mVarArr) {
                    w.mo29199w(appendable, nVar, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            Locale locale2;
            C12688m[] mVarArr = this.f31167a;
            if (mVarArr != null) {
                if (locale == null) {
                    locale2 = Locale.getDefault();
                } else {
                    locale2 = locale;
                }
                for (C12688m y : mVarArr) {
                    y.mo29200y(appendable, j, aVar, i, dateTimeZone, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$c */
    public static class C12660c extends C12664g {
        public C12660c(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            int i2;
            char charAt;
            int b = super.mo29196b(dVar, charSequence, i);
            if (b < 0 || b == (i2 = this.f31177b + i)) {
                return b;
            }
            if (this.f31178c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            if (b > i2) {
                return ~(i2 + 1);
            }
            if (b < i2) {
                return ~b;
            }
            return b;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$d */
    public static class C12661d implements C12688m, C12686k {

        /* renamed from: a */
        public final DateTimeFieldType f31171a;

        /* renamed from: b */
        public int f31172b;

        /* renamed from: c */
        public int f31173c;

        public C12661d(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.f31171a = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.f31172b = i;
            this.f31173c = i2;
        }

        /* renamed from: a */
        public final long[] mo29205a(long j, C12599c cVar) {
            long j2;
            long X = cVar.mo28841t().mo28947X();
            int i = this.f31173c;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = C31570c.f76591e;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((X * j2) / j2 == X) {
                    return new long[]{(j * j2) / X, (long) i};
                }
                i--;
            }
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            C12599c F = this.f31171a.mo27802F(dVar.mo29278p());
            int min = Math.min(this.f31173c, charSequence.length() - i);
            long X = F.mo28841t().mo28947X() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                X /= 10;
                j += ((long) (charAt - '0')) * X;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return ~i;
            }
            if (j2 > 2147483647L) {
                return ~i;
            }
            dVar.mo29288z(new C12654g(DateTimeFieldType.m51313N(), MillisDurationField.f31128a, F.mo28841t()), (int) j2);
            return i + i2;
        }

        /* renamed from: c */
        public void mo29206c(Appendable appendable, long j, C12589a aVar) throws IOException {
            String str;
            C12599c F = this.f31171a.mo27802F(aVar);
            int i = this.f31172b;
            try {
                long M = F.mo28810M(j);
                if (M == 0) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            appendable.append('0');
                        } else {
                            return;
                        }
                    }
                } else {
                    long[] a = mo29205a(M, F);
                    long j2 = a[0];
                    int i2 = (int) a[1];
                    if ((2147483647L & j2) == j2) {
                        str = Integer.toString((int) j2);
                    } else {
                        str = Long.toString(j2);
                    }
                    int length = str.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && str.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < str.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(str.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(str);
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.m53880c0(appendable, i);
            }
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31173c;
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31173c;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            mo29206c(appendable, nVar.mo27982m().mo28624J(nVar, 0), nVar.mo27982m());
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            mo29206c(appendable, j, aVar);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$e */
    public static class C12662e implements C12686k {

        /* renamed from: a */
        public final C12686k[] f31174a;

        /* renamed from: b */
        public final int f31175b;

        public C12662e(C12686k[] kVarArr) {
            int g;
            this.f31174a = kVarArr;
            int length = kVarArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    C12686k kVar = kVarArr[length];
                    if (kVar != null && (g = kVar.mo29197g()) > i) {
                        i = g;
                    }
                } else {
                    this.f31175b = i;
                    return;
                }
            }
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            C12686k[] kVarArr = this.f31174a;
            int length = kVarArr.length;
            Object C = dVar.mo29268C();
            boolean z = false;
            Object obj = null;
            int i4 = i;
            int i5 = i4;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                C12686k kVar = kVarArr[i6];
                if (kVar != null) {
                    int b = kVar.mo29196b(dVar, charSequence, i);
                    if (b >= i) {
                        if (b <= i4) {
                            continue;
                        } else if (b >= charSequence.length() || (i3 = i6 + 1) >= length || kVarArr[i3] == null) {
                            return b;
                        } else {
                            obj = dVar.mo29268C();
                            i4 = b;
                        }
                    } else if (b < 0 && (i2 = ~b) > i5) {
                        i5 = i2;
                    }
                    dVar.mo29287y(C);
                    i6++;
                } else if (i4 <= i) {
                    return i;
                } else {
                    z = true;
                }
            }
            if (i4 <= i && (i4 != i || !z)) {
                return ~i5;
            }
            if (obj != null) {
                dVar.mo29287y(obj);
            }
            return i4;
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31175b;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$f */
    public static abstract class C12663f implements C12688m, C12686k {

        /* renamed from: a */
        public final DateTimeFieldType f31176a;

        /* renamed from: b */
        public final int f31177b;

        /* renamed from: c */
        public final boolean f31178c;

        public C12663f(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f31176a = dateTimeFieldType;
            this.f31177b = i;
            this.f31178c = z;
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            boolean z;
            boolean z2;
            char charAt;
            CharSequence charSequence2 = charSequence;
            int i5 = i;
            int min = Math.min(this.f31177b, charSequence.length() - i5);
            int i6 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i6 >= min) {
                    break;
                }
                int i7 = i5 + i6;
                char charAt2 = charSequence2.charAt(i7);
                if (i6 != 0 || ((charAt2 != '-' && charAt2 != '+') || !this.f31178c)) {
                    if (charAt2 < '0' || charAt2 > '9') {
                        break;
                    }
                    i6++;
                } else {
                    z = true;
                    if (charAt2 == '-') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (charAt2 != '+') {
                        z = false;
                    }
                    int i8 = i6 + 1;
                    if (i8 >= min || (charAt = charSequence2.charAt(i7 + 1)) < '0' || charAt > '9') {
                        boolean z5 = z2;
                        z4 = z;
                        z3 = z5;
                    } else {
                        min = Math.min(min + 1, charSequence.length() - i5);
                        i6 = i8;
                        boolean z6 = z2;
                        z4 = z;
                        z3 = z6;
                    }
                }
            }
            boolean z52 = z2;
            z4 = z;
            z3 = z52;
            if (i6 == 0) {
                return ~i5;
            }
            if (i6 < 9) {
                if (z3 || z4) {
                    i4 = i5 + 1;
                } else {
                    i4 = i5;
                }
                int i9 = i4 + 1;
                try {
                    int charAt3 = charSequence2.charAt(i4) - '0';
                    i2 = i5 + i6;
                    while (i9 < i2) {
                        int charAt4 = (((charAt3 << 3) + (charAt3 << 1)) + charSequence2.charAt(i9)) - 48;
                        i9++;
                        charAt3 = charAt4;
                    }
                    if (z3) {
                        i3 = -charAt3;
                    } else {
                        i3 = charAt3;
                    }
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i5;
                }
            } else if (z4) {
                int i10 = i5 + 1;
                i2 = i5 + i6;
                i3 = Integer.parseInt(charSequence2.subSequence(i10, i2).toString());
            } else {
                int i11 = i5 + i6;
                i3 = Integer.parseInt(charSequence2.subSequence(i5, i11).toString());
                i2 = i11;
            }
            dVar.mo29266A(this.f31176a, i3);
            return i2;
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31177b;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$g */
    public static class C12664g extends C12663f {

        /* renamed from: d */
        public final int f31179d;

        public C12664g(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.f31179d = i2;
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31177b;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            if (nVar.mo27949K(this.f31176a)) {
                try {
                    C12682h.m54156a(appendable, nVar.mo27959T(this.f31176a), this.f31179d);
                } catch (RuntimeException unused) {
                    DateTimeFormatterBuilder.m53880c0(appendable, this.f31179d);
                }
            } else {
                DateTimeFormatterBuilder.m53880c0(appendable, this.f31179d);
            }
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                C12682h.m54156a(appendable, this.f31176a.mo27802F(aVar).mo28828g(j), this.f31179d);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.m53880c0(appendable, this.f31179d);
            }
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$h */
    public static class C12665h implements C12688m, C12686k {

        /* renamed from: a */
        public final String f31180a;

        public C12665h(String str) {
            this.f31180a = str;
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            if (DateTimeFormatterBuilder.m53882p0(charSequence, i, this.f31180a)) {
                return i + this.f31180a.length();
            }
            return ~i;
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31180a.length();
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31180a.length();
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            appendable.append(this.f31180a);
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f31180a);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$i */
    public static class C12666i implements C12688m, C12686k {

        /* renamed from: c */
        public static Map<Locale, Map<DateTimeFieldType, Object[]>> f31181c = new ConcurrentHashMap();

        /* renamed from: a */
        public final DateTimeFieldType f31182a;

        /* renamed from: b */
        public final boolean f31183b;

        public C12666i(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.f31182a = dateTimeFieldType;
            this.f31183b = z;
        }

        /* renamed from: a */
        public final String mo29207a(long j, C12589a aVar, Locale locale) {
            C12599c F = this.f31182a.mo27802F(aVar);
            if (this.f31183b) {
                return F.mo28831j(j, locale);
            }
            return F.mo28836o(j, locale);
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            int i2;
            Map map;
            Locale q = dVar.mo29279q();
            Map map2 = f31181c.get(q);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                f31181c.put(q, map2);
            }
            Object[] objArr = (Object[]) map2.get(this.f31182a);
            if (objArr == null) {
                map = new ConcurrentHashMap(32);
                MutableDateTime.Property G2 = new MutableDateTime(0, DateTimeZone.f30651a).mo28238G2(this.f31182a);
                int w = G2.mo29067w();
                int t = G2.mo29064t();
                if (t - w > 32) {
                    return ~i;
                }
                i2 = G2.mo29062r(q);
                while (w <= t) {
                    G2.mo28308L(w);
                    String e = G2.mo29049e(q);
                    Boolean bool = Boolean.TRUE;
                    map.put(e, bool);
                    map.put(G2.mo29049e(q).toLowerCase(q), bool);
                    map.put(G2.mo29049e(q).toUpperCase(q), bool);
                    map.put(G2.mo29053h(q), bool);
                    map.put(G2.mo29053h(q).toLowerCase(q), bool);
                    map.put(G2.mo29053h(q).toUpperCase(q), bool);
                    w++;
                }
                if ("en".equals(q.getLanguage()) && this.f31182a == DateTimeFieldType.m51308D()) {
                    Boolean bool2 = Boolean.TRUE;
                    map.put("BCE", bool2);
                    map.put("bce", bool2);
                    map.put("CE", bool2);
                    map.put("ce", bool2);
                    i2 = 3;
                }
                map2.put(this.f31182a, new Object[]{map, Integer.valueOf(i2)});
            } else {
                i2 = ((Integer) objArr[1]).intValue();
                map = (Map) objArr[0];
            }
            for (int min = Math.min(charSequence.length(), i2 + i); min > i; min--) {
                String charSequence2 = charSequence.subSequence(i, min).toString();
                if (map.containsKey(charSequence2)) {
                    dVar.mo29267B(this.f31182a, charSequence2, q);
                    return min;
                }
            }
            return ~i;
        }

        /* renamed from: c */
        public final String mo29208c(C12714n nVar, Locale locale) {
            if (!nVar.mo27949K(this.f31182a)) {
                return C2765d.f7275b;
            }
            C12599c F = this.f31182a.mo27802F(nVar.mo27982m());
            if (this.f31183b) {
                return F.mo28833l(nVar, locale);
            }
            return F.mo28838q(nVar, locale);
        }

        /* renamed from: g */
        public int mo29197g() {
            return mo29198q();
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31183b ? 6 : 20;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            try {
                appendable.append(mo29208c(nVar, locale));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(mo29207a(j, aVar, locale));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$j */
    public static class C12667j implements C12688m, C12686k {

        /* renamed from: c */
        public static final int f31184c = 0;

        /* renamed from: d */
        public static final int f31185d = 1;

        /* renamed from: a */
        public final Map<String, DateTimeZone> f31186a;

        /* renamed from: b */
        public final int f31187b;

        public C12667j(int i, Map<String, DateTimeZone> map) {
            this.f31187b = i;
            this.f31186a = map;
        }

        /* renamed from: a */
        public final String mo29209a(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.f31187b;
            if (i == 0) {
                return dateTimeZone.mo27827t(j, locale);
            }
            if (i != 1) {
                return "";
            }
            return dateTimeZone.mo27810B(j, locale);
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> map = this.f31186a;
            if (map == null) {
                map = C12641d.m53372g();
            }
            String str = null;
            for (String next : map.keySet()) {
                if (DateTimeFormatterBuilder.m53881o0(charSequence, i, next) && (str == null || next.length() > str.length())) {
                    str = next;
                }
            }
            if (str == null) {
                return ~i;
            }
            dVar.mo29272G(map.get(str));
            return i + str.length();
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31187b == 1 ? 4 : 20;
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31187b == 1 ? 4 : 20;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(mo29209a(j - ((long) i), dateTimeZone, locale));
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$k */
    public static class C12668k implements C12688m, C12686k {

        /* renamed from: a */
        public final String f31188a;

        /* renamed from: b */
        public final String f31189b;

        /* renamed from: c */
        public final boolean f31190c;

        /* renamed from: d */
        public final int f31191d;

        /* renamed from: e */
        public final int f31192e;

        public C12668k(String str, String str2, boolean z, int i, int i2) {
            this.f31188a = str;
            this.f31189b = str2;
            this.f31190c = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            if (i > 4) {
                i = 4;
                i2 = 4;
            }
            this.f31191d = i;
            this.f31192e = i2;
        }

        /* renamed from: a */
        public final int mo29210a(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
            if (r6 <= '9') goto L_0x0081;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo29196b(org.joda.time.format.C12676d r12, java.lang.CharSequence r13, int r14) {
            /*
                r11 = this;
                int r0 = r13.length()
                int r0 = r0 - r14
                java.lang.String r1 = r11.f31189b
                r2 = 43
                r3 = 45
                r4 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r1 == 0) goto L_0x003a
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0027
                if (r0 <= 0) goto L_0x0023
                char r1 = r13.charAt(r14)
                if (r1 == r3) goto L_0x003a
                if (r1 != r2) goto L_0x0023
                goto L_0x003a
            L_0x0023:
                r12.mo29270E(r5)
                return r14
            L_0x0027:
                java.lang.String r1 = r11.f31189b
                boolean r1 = org.joda.time.format.DateTimeFormatterBuilder.m53882p0(r13, r14, r1)
                if (r1 == 0) goto L_0x003a
                r12.mo29270E(r5)
                java.lang.String r12 = r11.f31189b
                int r12 = r12.length()
                int r14 = r14 + r12
                return r14
            L_0x003a:
                r1 = 1
                if (r0 > r1) goto L_0x003f
                int r12 = ~r14
                return r12
            L_0x003f:
                char r5 = r13.charAt(r14)
                if (r5 != r3) goto L_0x0047
                r2 = r1
                goto L_0x004a
            L_0x0047:
                if (r5 != r2) goto L_0x0124
                r2 = r4
            L_0x004a:
                int r0 = r0 + -1
                int r14 = r14 + r1
                r3 = 2
                int r5 = r11.mo29210a(r13, r14, r3)
                if (r5 >= r3) goto L_0x0056
                int r12 = ~r14
                return r12
            L_0x0056:
                int r5 = org.joda.time.format.C12682h.m54166k(r13, r14)
                r6 = 23
                if (r5 <= r6) goto L_0x0060
                int r12 = ~r14
                return r12
            L_0x0060:
                r6 = 3600000(0x36ee80, float:5.044674E-39)
                int r5 = r5 * r6
                int r0 = r0 + -2
                int r14 = r14 + r3
                if (r0 > 0) goto L_0x006b
                goto L_0x0119
            L_0x006b:
                char r6 = r13.charAt(r14)
                r7 = 58
                r8 = 48
                if (r6 != r7) goto L_0x007b
                int r0 = r0 + -1
                int r14 = r14 + 1
                r4 = r1
                goto L_0x0081
            L_0x007b:
                if (r6 < r8) goto L_0x0119
                r9 = 57
                if (r6 > r9) goto L_0x0119
            L_0x0081:
                int r6 = r11.mo29210a(r13, r14, r3)
                if (r6 != 0) goto L_0x008b
                if (r4 != 0) goto L_0x008b
                goto L_0x0119
            L_0x008b:
                if (r6 >= r3) goto L_0x008f
                int r12 = ~r14
                return r12
            L_0x008f:
                int r6 = org.joda.time.format.C12682h.m54166k(r13, r14)
                r9 = 59
                if (r6 <= r9) goto L_0x0099
                int r12 = ~r14
                return r12
            L_0x0099:
                r10 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r10
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r14 = r14 + 2
                if (r0 > 0) goto L_0x00a6
                goto L_0x0119
            L_0x00a6:
                if (r4 == 0) goto L_0x00b4
                char r6 = r13.charAt(r14)
                if (r6 == r7) goto L_0x00b0
                goto L_0x0119
            L_0x00b0:
                int r0 = r0 + -1
                int r14 = r14 + 1
            L_0x00b4:
                int r6 = r11.mo29210a(r13, r14, r3)
                if (r6 != 0) goto L_0x00bd
                if (r4 != 0) goto L_0x00bd
                goto L_0x0119
            L_0x00bd:
                if (r6 >= r3) goto L_0x00c1
                int r12 = ~r14
                return r12
            L_0x00c1:
                int r6 = org.joda.time.format.C12682h.m54166k(r13, r14)
                if (r6 <= r9) goto L_0x00c9
                int r12 = ~r14
                return r12
            L_0x00c9:
                int r6 = r6 * 1000
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r14 = r14 + 2
                if (r0 > 0) goto L_0x00d3
                goto L_0x0119
            L_0x00d3:
                if (r4 == 0) goto L_0x00e8
                char r0 = r13.charAt(r14)
                r6 = 46
                if (r0 == r6) goto L_0x00e6
                char r0 = r13.charAt(r14)
                r6 = 44
                if (r0 == r6) goto L_0x00e6
                goto L_0x0119
            L_0x00e6:
                int r14 = r14 + 1
            L_0x00e8:
                r0 = 3
                int r0 = r11.mo29210a(r13, r14, r0)
                if (r0 != 0) goto L_0x00f2
                if (r4 != 0) goto L_0x00f2
                goto L_0x0119
            L_0x00f2:
                if (r0 >= r1) goto L_0x00f6
                int r12 = ~r14
                return r12
            L_0x00f6:
                int r4 = r14 + 1
                char r14 = r13.charAt(r14)
                int r14 = r14 - r8
                int r14 = r14 * 100
                int r5 = r5 + r14
                if (r0 <= r1) goto L_0x0118
                int r14 = r4 + 1
                char r1 = r13.charAt(r4)
                int r1 = r1 - r8
                int r1 = r1 * 10
                int r5 = r5 + r1
                if (r0 <= r3) goto L_0x0119
                int r0 = r14 + 1
                char r13 = r13.charAt(r14)
                int r13 = r13 - r8
                int r5 = r5 + r13
                r14 = r0
                goto L_0x0119
            L_0x0118:
                r14 = r4
            L_0x0119:
                if (r2 == 0) goto L_0x011c
                int r5 = -r5
            L_0x011c:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
                r12.mo29270E(r13)
                return r14
            L_0x0124:
                int r12 = ~r14
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.C12668k.mo29196b(org.joda.time.format.d, java.lang.CharSequence, int):int");
        }

        /* renamed from: g */
        public int mo29197g() {
            return mo29198q();
        }

        /* renamed from: q */
        public int mo29198q() {
            int i = this.f31191d;
            int i2 = (i + 1) << 1;
            if (this.f31190c) {
                i2 += i - 1;
            }
            String str = this.f31188a;
            if (str == null || str.length() <= i2) {
                return i2;
            }
            return this.f31188a.length();
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone != null) {
                if (i != 0 || (str = this.f31188a) == null) {
                    if (i >= 0) {
                        appendable.append('+');
                    } else {
                        appendable.append('-');
                        i = -i;
                    }
                    int i2 = i / 3600000;
                    C12682h.m54156a(appendable, i2, 2);
                    if (this.f31192e != 1) {
                        int i3 = i - (i2 * 3600000);
                        if (i3 != 0 || this.f31191d > 1) {
                            int i4 = i3 / 60000;
                            if (this.f31190c) {
                                appendable.append(C12361b.f30257h);
                            }
                            C12682h.m54156a(appendable, i4, 2);
                            if (this.f31192e != 2) {
                                int i5 = i3 - (i4 * 60000);
                                if (i5 != 0 || this.f31191d > 2) {
                                    int i6 = i5 / 1000;
                                    if (this.f31190c) {
                                        appendable.append(C12361b.f30257h);
                                    }
                                    C12682h.m54156a(appendable, i6, 2);
                                    if (this.f31192e != 3) {
                                        int i7 = i5 - (i6 * 1000);
                                        if (i7 != 0 || this.f31191d > 3) {
                                            if (this.f31190c) {
                                                appendable.append('.');
                                            }
                                            C12682h.m54156a(appendable, i7, 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                appendable.append(str);
            }
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$l */
    public static class C12669l implements C12688m, C12686k {

        /* renamed from: a */
        public final DateTimeFieldType f31193a;

        /* renamed from: b */
        public final int f31194b;

        /* renamed from: c */
        public final boolean f31195c;

        public C12669l(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f31193a = dateTimeFieldType;
            this.f31194b = i;
            this.f31195c = z;
        }

        /* renamed from: a */
        public final int mo29211a(long j, C12589a aVar) {
            try {
                int g = this.f31193a.mo27802F(aVar).mo28828g(j);
                if (g < 0) {
                    g = -g;
                }
                return g % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public int mo29196b(C12676d dVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int length = charSequence.length() - i;
            int i6 = 0;
            if (this.f31195c) {
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < length) {
                    char charAt = charSequence.charAt(i + i7);
                    if (i7 != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i7++;
                    } else {
                        if (charAt == '-') {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i7++;
                        } else {
                            i++;
                            length--;
                        }
                        z = true;
                    }
                }
                if (i7 == 0) {
                    return ~i;
                }
                if (z || i7 != 2) {
                    if (i7 >= 9) {
                        i4 = i7 + i;
                        i3 = Integer.parseInt(charSequence.subSequence(i, i4).toString());
                    } else {
                        if (z2) {
                            i5 = i + 1;
                        } else {
                            i5 = i;
                        }
                        int i8 = i5 + 1;
                        try {
                            int charAt2 = charSequence.charAt(i5) - '0';
                            i4 = i7 + i;
                            while (i8 < i4) {
                                i8++;
                                charAt2 = (((charAt2 << 3) + (charAt2 << 1)) + charSequence.charAt(i8)) - 48;
                            }
                            if (z2) {
                                i3 = -charAt2;
                            } else {
                                i3 = charAt2;
                            }
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i;
                        }
                    }
                    dVar.mo29266A(this.f31193a, i3);
                    return i4;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i;
            }
            char charAt3 = charSequence.charAt(i);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i;
            }
            int i9 = charAt3 - '0';
            char charAt4 = charSequence.charAt(i + 1);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i;
            }
            int i10 = (((i9 << 3) + (i9 << 1)) + charAt4) - 48;
            int i11 = this.f31194b;
            if (dVar.mo29282t() != null) {
                i11 = dVar.mo29282t().intValue();
            }
            int i12 = i11 - 50;
            if (i12 >= 0) {
                i2 = i12 % 100;
            } else {
                i2 = ((i12 + 1) % 100) + 99;
            }
            if (i10 < i2) {
                i6 = 100;
            }
            dVar.mo29266A(this.f31193a, i10 + ((i12 + i6) - i2));
            return i + 2;
        }

        /* renamed from: c */
        public final int mo29212c(C12714n nVar) {
            if (!nVar.mo27949K(this.f31193a)) {
                return -1;
            }
            try {
                int T = nVar.mo27959T(this.f31193a);
                if (T < 0) {
                    T = -T;
                }
                return T % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        /* renamed from: g */
        public int mo29197g() {
            return this.f31195c ? 4 : 2;
        }

        /* renamed from: q */
        public int mo29198q() {
            return 2;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            int c = mo29212c(nVar);
            if (c < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            C12682h.m54156a(appendable, c, 2);
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int a = mo29211a(j, aVar);
            if (a < 0) {
                appendable.append(65533);
                appendable.append(65533);
                return;
            }
            C12682h.m54156a(appendable, a, 2);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$m */
    public static class C12670m extends C12663f {
        public C12670m(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        /* renamed from: q */
        public int mo29198q() {
            return this.f31177b;
        }

        /* renamed from: w */
        public void mo29199w(Appendable appendable, C12714n nVar, Locale locale) throws IOException {
            if (nVar.mo27949K(this.f31176a)) {
                try {
                    C12682h.m54160e(appendable, nVar.mo27959T(this.f31176a));
                } catch (RuntimeException unused) {
                    appendable.append(65533);
                }
            } else {
                appendable.append(65533);
            }
        }

        /* renamed from: y */
        public void mo29200y(Appendable appendable, long j, C12589a aVar, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                C12682h.m54160e(appendable, this.f31176a.mo27802F(aVar).mo28828g(j));
            } catch (RuntimeException unused) {
                appendable.append(65533);
            }
        }
    }

    /* renamed from: c0 */
    public static void m53880c0(Appendable appendable, int i) throws IOException {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append(65533);
            } else {
                return;
            }
        }
    }

    /* renamed from: o0 */
    public static boolean m53881o0(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p0 */
    public static boolean m53882p0(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public DateTimeFormatterBuilder mo29124A(int i) {
        return mo29178p(DateTimeFieldType.m51311K(), i, 2);
    }

    /* renamed from: B */
    public DateTimeFormatterBuilder mo29125B(char c) {
        return mo29159f(new C12658a(c));
    }

    /* renamed from: C */
    public DateTimeFormatterBuilder mo29126C(String str) {
        if (str != null) {
            int length = str.length();
            if (length == 0) {
                return this;
            }
            if (length != 1) {
                return mo29159f(new C12665h(str));
            }
            return mo29159f(new C12658a(str.charAt(0)));
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    /* renamed from: D */
    public DateTimeFormatterBuilder mo29127D(int i) {
        return mo29178p(DateTimeFieldType.m51312M(), i, 8);
    }

    /* renamed from: E */
    public DateTimeFormatterBuilder mo29128E(int i) {
        return mo29178p(DateTimeFieldType.m51313N(), i, 3);
    }

    /* renamed from: F */
    public DateTimeFormatterBuilder mo29129F(int i) {
        return mo29178p(DateTimeFieldType.m51314O(), i, 4);
    }

    /* renamed from: G */
    public DateTimeFormatterBuilder mo29130G(int i) {
        return mo29178p(DateTimeFieldType.m51315P(), i, 2);
    }

    /* renamed from: H */
    public DateTimeFormatterBuilder mo29131H(int i) {
        return mo29178p(DateTimeFieldType.m51316Q(), i, 2);
    }

    /* renamed from: I */
    public DateTimeFormatterBuilder mo29132I() {
        return mo29138O(DateTimeFieldType.m51316Q());
    }

    /* renamed from: J */
    public DateTimeFormatterBuilder mo29133J() {
        return mo29140Q(DateTimeFieldType.m51316Q());
    }

    /* renamed from: K */
    public DateTimeFormatterBuilder mo29134K(C12675c cVar) {
        mo29172l0(cVar);
        return mo29161g((C12688m) null, new C12662e(new C12686k[]{C12679e.m54142c(cVar), null}));
    }

    /* renamed from: L */
    public DateTimeFormatterBuilder mo29135L(String str) {
        C12671a.m54023a(this, str);
        return this;
    }

    /* renamed from: M */
    public DateTimeFormatterBuilder mo29136M(int i) {
        return mo29178p(DateTimeFieldType.m51317R(), i, 5);
    }

    /* renamed from: N */
    public DateTimeFormatterBuilder mo29137N(int i) {
        return mo29178p(DateTimeFieldType.m51318S(), i, 2);
    }

    /* renamed from: O */
    public DateTimeFormatterBuilder mo29138O(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return mo29159f(new C12666i(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: P */
    public DateTimeFormatterBuilder mo29139P(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                return mo29159f(new C12670m(dateTimeFieldType, i2, true));
            } else {
                return mo29159f(new C12664g(dateTimeFieldType, i2, true, i));
            }
        } else {
            throw new IllegalArgumentException("Field type must not be null");
        }
    }

    /* renamed from: Q */
    public DateTimeFormatterBuilder mo29140Q(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return mo29159f(new C12666i(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: R */
    public DateTimeFormatterBuilder mo29141R() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return mo29161g(timeZoneId, timeZoneId);
    }

    /* renamed from: S */
    public DateTimeFormatterBuilder mo29142S() {
        return mo29161g(new C12667j(0, (Map<String, DateTimeZone>) null), (C12686k) null);
    }

    /* renamed from: T */
    public DateTimeFormatterBuilder mo29143T(Map<String, DateTimeZone> map) {
        C12667j jVar = new C12667j(0, map);
        return mo29161g(jVar, jVar);
    }

    /* renamed from: U */
    public DateTimeFormatterBuilder mo29144U(String str, String str2, boolean z, int i, int i2) {
        return mo29159f(new C12668k(str, str2, z, i, i2));
    }

    /* renamed from: V */
    public DateTimeFormatterBuilder mo29145V(String str, boolean z, int i, int i2) {
        return mo29159f(new C12668k(str, str, z, i, i2));
    }

    /* renamed from: W */
    public DateTimeFormatterBuilder mo29146W() {
        return mo29161g(new C12667j(1, (Map<String, DateTimeZone>) null), (C12686k) null);
    }

    /* renamed from: X */
    public DateTimeFormatterBuilder mo29147X(Map<String, DateTimeZone> map) {
        C12667j jVar = new C12667j(1, map);
        return mo29161g(jVar, jVar);
    }

    /* renamed from: Y */
    public DateTimeFormatterBuilder mo29148Y(int i) {
        return mo29149Z(i, false);
    }

    /* renamed from: Z */
    public DateTimeFormatterBuilder mo29149Z(int i, boolean z) {
        return mo29159f(new C12669l(DateTimeFieldType.m51320U(), i, z));
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder mo29150a(C12674b bVar) {
        if (bVar != null) {
            return mo29161g(bVar.mo29246i(), bVar.mo29243f());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    /* renamed from: a0 */
    public DateTimeFormatterBuilder mo29151a0(int i) {
        return mo29153b0(i, false);
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder mo29152b(C12675c cVar) {
        mo29172l0(cVar);
        return mo29161g((C12688m) null, C12679e.m54142c(cVar));
    }

    /* renamed from: b0 */
    public DateTimeFormatterBuilder mo29153b0(int i, boolean z) {
        return mo29159f(new C12669l(DateTimeFieldType.m51322W(), i, z));
    }

    /* renamed from: c */
    public DateTimeFormatterBuilder mo29154c(C12680f fVar) {
        mo29174m0(fVar);
        return mo29161g(C12681g.m54151b(fVar), (C12686k) null);
    }

    /* renamed from: d */
    public DateTimeFormatterBuilder mo29155d(C12680f fVar, C12675c cVar) {
        mo29174m0(fVar);
        mo29172l0(cVar);
        return mo29161g(C12681g.m54151b(fVar), C12679e.m54142c(cVar));
    }

    /* renamed from: d0 */
    public DateTimeFormatterBuilder mo29156d0(int i) {
        return mo29178p(DateTimeFieldType.m51319T(), i, 2);
    }

    /* renamed from: e */
    public DateTimeFormatterBuilder mo29157e(C12680f fVar, C12675c[] cVarArr) {
        if (fVar != null) {
            mo29174m0(fVar);
        }
        if (cVarArr != null) {
            int length = cVarArr.length;
            int i = 0;
            if (length != 1) {
                C12686k[] kVarArr = new C12686k[length];
                while (i < length - 1) {
                    C12686k c = C12679e.m54142c(cVarArr[i]);
                    kVarArr[i] = c;
                    if (c != null) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Incomplete parser array");
                    }
                }
                kVarArr[i] = C12679e.m54142c(cVarArr[i]);
                return mo29161g(C12681g.m54151b(fVar), new C12662e(kVarArr));
            } else if (cVarArr[0] != null) {
                return mo29161g(C12681g.m54151b(fVar), C12679e.m54142c(cVarArr[0]));
            } else {
                throw new IllegalArgumentException("No parser supplied");
            }
        } else {
            throw new IllegalArgumentException("No parsers supplied");
        }
    }

    /* renamed from: e0 */
    public DateTimeFormatterBuilder mo29158e0(int i, int i2) {
        return mo29139P(DateTimeFieldType.m51320U(), i, i2);
    }

    /* renamed from: f */
    public final DateTimeFormatterBuilder mo29159f(Object obj) {
        this.f31158b = null;
        this.f31157a.add(obj);
        this.f31157a.add(obj);
        return this;
    }

    /* renamed from: f0 */
    public DateTimeFormatterBuilder mo29160f0(int i, int i2) {
        return mo29139P(DateTimeFieldType.m51322W(), i, i2);
    }

    /* renamed from: g */
    public final DateTimeFormatterBuilder mo29161g(C12688m mVar, C12686k kVar) {
        this.f31158b = null;
        this.f31157a.add(mVar);
        this.f31157a.add(kVar);
        return this;
    }

    /* renamed from: g0 */
    public DateTimeFormatterBuilder mo29162g0(int i, int i2) {
        return mo29178p(DateTimeFieldType.m51323X(), i, i2);
    }

    /* renamed from: h */
    public DateTimeFormatterBuilder mo29163h(int i, int i2) {
        return mo29139P(DateTimeFieldType.m51348x(), i, i2);
    }

    /* renamed from: h0 */
    public DateTimeFormatterBuilder mo29164h0(int i, int i2) {
        return mo29178p(DateTimeFieldType.m51324Y(), i, i2);
    }

    /* renamed from: i */
    public DateTimeFormatterBuilder mo29165i(int i) {
        return mo29178p(DateTimeFieldType.m51349y(), i, 2);
    }

    /* renamed from: i0 */
    public boolean mo29166i0() {
        return mo29182r0(mo29180q0());
    }

    /* renamed from: j */
    public DateTimeFormatterBuilder mo29167j(int i) {
        return mo29178p(DateTimeFieldType.m51350z(), i, 2);
    }

    /* renamed from: j0 */
    public boolean mo29168j0() {
        return mo29184s0(mo29180q0());
    }

    /* renamed from: k */
    public DateTimeFormatterBuilder mo29169k(int i) {
        return mo29178p(DateTimeFieldType.m51305A(), i, 2);
    }

    /* renamed from: k0 */
    public boolean mo29170k0() {
        return mo29186t0(mo29180q0());
    }

    /* renamed from: l */
    public DateTimeFormatterBuilder mo29171l(int i) {
        return mo29178p(DateTimeFieldType.m51306B(), i, 1);
    }

    /* renamed from: l0 */
    public final void mo29172l0(C12675c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    /* renamed from: m */
    public DateTimeFormatterBuilder mo29173m() {
        return mo29138O(DateTimeFieldType.m51306B());
    }

    /* renamed from: m0 */
    public final void mo29174m0(C12680f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    /* renamed from: n */
    public DateTimeFormatterBuilder mo29175n() {
        return mo29140Q(DateTimeFieldType.m51306B());
    }

    /* renamed from: n0 */
    public void mo29176n0() {
        this.f31158b = null;
        this.f31157a.clear();
    }

    /* renamed from: o */
    public DateTimeFormatterBuilder mo29177o(int i) {
        return mo29178p(DateTimeFieldType.m51307C(), i, 3);
    }

    /* renamed from: p */
    public DateTimeFormatterBuilder mo29178p(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                return mo29159f(new C12670m(dateTimeFieldType, i2, false));
            } else {
                return mo29159f(new C12664g(dateTimeFieldType, i2, false, i));
            }
        } else {
            throw new IllegalArgumentException("Field type must not be null");
        }
    }

    /* renamed from: q */
    public DateTimeFormatterBuilder mo29179q() {
        return mo29140Q(DateTimeFieldType.m51308D());
    }

    /* renamed from: q0 */
    public final Object mo29180q0() {
        Object obj = this.f31158b;
        if (obj == null) {
            if (this.f31157a.size() == 2) {
                Object obj2 = this.f31157a.get(0);
                Object obj3 = this.f31157a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new C12659b(this.f31157a);
            }
            this.f31158b = obj;
        }
        return obj;
    }

    /* renamed from: r */
    public DateTimeFormatterBuilder mo29181r(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return mo29159f(new C12660c(dateTimeFieldType, i, false));
        } else {
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
    }

    /* renamed from: r0 */
    public final boolean mo29182r0(Object obj) {
        return mo29186t0(obj) || mo29184s0(obj);
    }

    /* renamed from: s */
    public DateTimeFormatterBuilder mo29183s(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return mo29159f(new C12660c(dateTimeFieldType, i, true));
        } else {
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
    }

    /* renamed from: s0 */
    public final boolean mo29184s0(Object obj) {
        if (!(obj instanceof C12686k)) {
            return false;
        }
        if (obj instanceof C12659b) {
            return ((C12659b) obj).mo29203d();
        }
        return true;
    }

    /* renamed from: t */
    public DateTimeFormatterBuilder mo29185t(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return mo29159f(new C12661d(dateTimeFieldType, i, i2));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: t0 */
    public final boolean mo29186t0(Object obj) {
        if (!(obj instanceof C12688m)) {
            return false;
        }
        if (obj instanceof C12659b) {
            return ((C12659b) obj).mo29204e();
        }
        return true;
    }

    /* renamed from: u */
    public DateTimeFormatterBuilder mo29187u(int i, int i2) {
        return mo29185t(DateTimeFieldType.m51307C(), i, i2);
    }

    /* renamed from: u0 */
    public C12674b mo29188u0() {
        C12688m mVar;
        Object q0 = mo29180q0();
        C12686k kVar = null;
        if (mo29186t0(q0)) {
            mVar = (C12688m) q0;
        } else {
            mVar = null;
        }
        if (mo29184s0(q0)) {
            kVar = (C12686k) q0;
        }
        if (mVar != null || kVar != null) {
            return new C12674b(mVar, kVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    /* renamed from: v */
    public DateTimeFormatterBuilder mo29189v(int i, int i2) {
        return mo29185t(DateTimeFieldType.m51310J(), i, i2);
    }

    /* renamed from: v0 */
    public C12675c mo29190v0() {
        Object q0 = mo29180q0();
        if (mo29184s0(q0)) {
            return C12687l.m54344a((C12686k) q0);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    /* renamed from: w */
    public DateTimeFormatterBuilder mo29191w(int i, int i2) {
        return mo29185t(DateTimeFieldType.m51314O(), i, i2);
    }

    /* renamed from: w0 */
    public C12680f mo29192w0() {
        Object q0 = mo29180q0();
        if (mo29186t0(q0)) {
            return C12689n.m54351a((C12688m) q0);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    /* renamed from: x */
    public DateTimeFormatterBuilder mo29193x(int i, int i2) {
        return mo29185t(DateTimeFieldType.m51317R(), i, i2);
    }

    /* renamed from: y */
    public DateTimeFormatterBuilder mo29194y() {
        return mo29140Q(DateTimeFieldType.m51309I());
    }

    /* renamed from: z */
    public DateTimeFormatterBuilder mo29195z(int i) {
        return mo29178p(DateTimeFieldType.m51310J(), i, 2);
    }
}
