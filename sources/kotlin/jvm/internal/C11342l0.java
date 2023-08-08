package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.C11665v0;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11498g;
import kotlin.reflect.C11499h;
import kotlin.reflect.C11500i;
import kotlin.reflect.C11504k;
import kotlin.reflect.C11506l;
import kotlin.reflect.C11508m;
import kotlin.reflect.C11514o;
import kotlin.reflect.C11516p;
import kotlin.reflect.C11518q;
import kotlin.reflect.C11520r;
import kotlin.reflect.C11522s;
import kotlin.reflect.C11523t;
import kotlin.reflect.KVariance;

/* renamed from: kotlin.jvm.internal.l0 */
public class C11342l0 {

    /* renamed from: a */
    public static final C11344m0 f28465a;

    /* renamed from: b */
    public static final String f28466b = " (Kotlin reflection is not available)";

    /* renamed from: c */
    public static final C11494d[] f28467c = new C11494d[0];

    static {
        C11344m0 m0Var = null;
        try {
            m0Var = (C11344m0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m0Var == null) {
            m0Var = new C11344m0();
        }
        f28465a = m0Var;
    }

    @C11665v0(version = "1.4")
    /* renamed from: A */
    public static C11520r m43538A(Class cls) {
        return f28465a.mo22816s(m43547d(cls), Collections.emptyList(), false);
    }

    @C11665v0(version = "1.4")
    /* renamed from: B */
    public static C11520r m43539B(Class cls, C11523t tVar) {
        return f28465a.mo22816s(m43547d(cls), Collections.singletonList(tVar), false);
    }

    @C11665v0(version = "1.4")
    /* renamed from: C */
    public static C11520r m43540C(Class cls, C11523t tVar, C11523t tVar2) {
        return f28465a.mo22816s(m43547d(cls), Arrays.asList(new C11523t[]{tVar, tVar2}), false);
    }

    @C11665v0(version = "1.4")
    /* renamed from: D */
    public static C11520r m43541D(Class cls, C11523t... tVarArr) {
        return f28465a.mo22816s(m43547d(cls), ArraysKt___ArraysKt.m39955kz(tVarArr), false);
    }

    @C11665v0(version = "1.4")
    /* renamed from: E */
    public static C11520r m43542E(C11498g gVar) {
        return f28465a.mo22816s(gVar, Collections.emptyList(), false);
    }

    @C11665v0(version = "1.4")
    /* renamed from: F */
    public static C11522s m43543F(Object obj, String str, KVariance kVariance, boolean z) {
        return f28465a.mo22817t(obj, str, kVariance, z);
    }

    /* renamed from: a */
    public static C11494d m43544a(Class cls) {
        return f28465a.mo22798a(cls);
    }

    /* renamed from: b */
    public static C11494d m43545b(Class cls, String str) {
        return f28465a.mo22799b(cls, str);
    }

    /* renamed from: c */
    public static C11500i m43546c(FunctionReference functionReference) {
        return f28465a.mo22800c(functionReference);
    }

    /* renamed from: d */
    public static C11494d m43547d(Class cls) {
        return f28465a.mo22801d(cls);
    }

    /* renamed from: e */
    public static C11494d m43548e(Class cls, String str) {
        return f28465a.mo22802e(cls, str);
    }

    /* renamed from: f */
    public static C11494d[] m43549f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f28467c;
        }
        C11494d[] dVarArr = new C11494d[length];
        for (int i = 0; i < length; i++) {
            dVarArr[i] = m43547d(clsArr[i]);
        }
        return dVarArr;
    }

    @C11665v0(version = "1.4")
    /* renamed from: g */
    public static C11499h m43550g(Class cls) {
        return f28465a.mo22803f(cls, "");
    }

    /* renamed from: h */
    public static C11499h m43551h(Class cls, String str) {
        return f28465a.mo22803f(cls, str);
    }

    @C11665v0(version = "1.6")
    /* renamed from: i */
    public static C11520r m43552i(C11520r rVar) {
        return f28465a.mo22804g(rVar);
    }

    /* renamed from: j */
    public static C11504k m43553j(MutablePropertyReference0 mutablePropertyReference0) {
        return f28465a.mo22805h(mutablePropertyReference0);
    }

    /* renamed from: k */
    public static C11506l m43554k(MutablePropertyReference1 mutablePropertyReference1) {
        return f28465a.mo22806i(mutablePropertyReference1);
    }

    /* renamed from: l */
    public static C11508m m43555l(MutablePropertyReference2 mutablePropertyReference2) {
        return f28465a.mo22807j(mutablePropertyReference2);
    }

    @C11665v0(version = "1.6")
    /* renamed from: m */
    public static C11520r m43556m(C11520r rVar) {
        return f28465a.mo22808k(rVar);
    }

    @C11665v0(version = "1.4")
    /* renamed from: n */
    public static C11520r m43557n(Class cls) {
        return f28465a.mo22816s(m43547d(cls), Collections.emptyList(), true);
    }

    @C11665v0(version = "1.4")
    /* renamed from: o */
    public static C11520r m43558o(Class cls, C11523t tVar) {
        return f28465a.mo22816s(m43547d(cls), Collections.singletonList(tVar), true);
    }

    @C11665v0(version = "1.4")
    /* renamed from: p */
    public static C11520r m43559p(Class cls, C11523t tVar, C11523t tVar2) {
        return f28465a.mo22816s(m43547d(cls), Arrays.asList(new C11523t[]{tVar, tVar2}), true);
    }

    @C11665v0(version = "1.4")
    /* renamed from: q */
    public static C11520r m43560q(Class cls, C11523t... tVarArr) {
        return f28465a.mo22816s(m43547d(cls), ArraysKt___ArraysKt.m39955kz(tVarArr), true);
    }

    @C11665v0(version = "1.4")
    /* renamed from: r */
    public static C11520r m43561r(C11498g gVar) {
        return f28465a.mo22816s(gVar, Collections.emptyList(), true);
    }

    @C11665v0(version = "1.6")
    /* renamed from: s */
    public static C11520r m43562s(C11520r rVar, C11520r rVar2) {
        return f28465a.mo22809l(rVar, rVar2);
    }

    /* renamed from: t */
    public static C11514o m43563t(PropertyReference0 propertyReference0) {
        return f28465a.mo22810m(propertyReference0);
    }

    /* renamed from: u */
    public static C11516p m43564u(PropertyReference1 propertyReference1) {
        return f28465a.mo22811n(propertyReference1);
    }

    /* renamed from: v */
    public static C11518q m43565v(PropertyReference2 propertyReference2) {
        return f28465a.mo22812o(propertyReference2);
    }

    @C11665v0(version = "1.3")
    /* renamed from: w */
    public static String m43566w(C11320a0 a0Var) {
        return f28465a.mo22813p(a0Var);
    }

    @C11665v0(version = "1.1")
    /* renamed from: x */
    public static String m43567x(Lambda lambda) {
        return f28465a.mo22814q(lambda);
    }

    @C11665v0(version = "1.4")
    /* renamed from: y */
    public static void m43568y(C11522s sVar, C11520r rVar) {
        f28465a.mo22815r(sVar, Collections.singletonList(rVar));
    }

    @C11665v0(version = "1.4")
    /* renamed from: z */
    public static void m43569z(C11522s sVar, C11520r... rVarArr) {
        f28465a.mo22815r(sVar, ArraysKt___ArraysKt.m39955kz(rVarArr));
    }
}
