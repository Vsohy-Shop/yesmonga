package kotlin.jvm.internal;

import java.util.List;
import kotlin.C11665v0;
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

/* renamed from: kotlin.jvm.internal.m0 */
public class C11344m0 {

    /* renamed from: a */
    public static final String f28469a = "kotlin.jvm.functions.";

    /* renamed from: a */
    public C11494d mo22798a(Class cls) {
        return new C11364s(cls);
    }

    /* renamed from: b */
    public C11494d mo22799b(Class cls, String str) {
        return new C11364s(cls);
    }

    /* renamed from: c */
    public C11500i mo22800c(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: d */
    public C11494d mo22801d(Class cls) {
        return new C11364s(cls);
    }

    /* renamed from: e */
    public C11494d mo22802e(Class cls, String str) {
        return new C11364s(cls);
    }

    /* renamed from: f */
    public C11499h mo22803f(Class cls, String str) {
        return new C11338j0(cls, str);
    }

    @C11665v0(version = "1.6")
    /* renamed from: g */
    public C11520r mo22804g(C11520r rVar) {
        TypeReference typeReference = (TypeReference) rVar;
        return new TypeReference(rVar.mo22759m(), rVar.getArguments(), typeReference.mo22753A(), typeReference.mo22763y() | 2);
    }

    /* renamed from: h */
    public C11504k mo22805h(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: i */
    public C11506l mo22806i(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: j */
    public C11508m mo22807j(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    @C11665v0(version = "1.6")
    /* renamed from: k */
    public C11520r mo22808k(C11520r rVar) {
        TypeReference typeReference = (TypeReference) rVar;
        return new TypeReference(rVar.mo22759m(), rVar.getArguments(), typeReference.mo22753A(), typeReference.mo22763y() | 4);
    }

    @C11665v0(version = "1.6")
    /* renamed from: l */
    public C11520r mo22809l(C11520r rVar, C11520r rVar2) {
        return new TypeReference(rVar.mo22759m(), rVar.getArguments(), rVar2, ((TypeReference) rVar).mo22763y());
    }

    /* renamed from: m */
    public C11514o mo22810m(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: n */
    public C11516p mo22811n(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: o */
    public C11518q mo22812o(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @C11665v0(version = "1.3")
    /* renamed from: p */
    public String mo22813p(C11320a0 a0Var) {
        String obj = a0Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith(f28469a)) {
            return obj.substring(21);
        }
        return obj;
    }

    @C11665v0(version = "1.1")
    /* renamed from: q */
    public String mo22814q(Lambda lambda) {
        return mo22813p(lambda);
    }

    @C11665v0(version = "1.4")
    /* renamed from: r */
    public void mo22815r(C11522s sVar, List<C11520r> list) {
        ((C11373v0) sVar).mo22873j(list);
    }

    @C11665v0(version = "1.4")
    /* renamed from: s */
    public C11520r mo22816s(C11498g gVar, List<C11523t> list, boolean z) {
        return new TypeReference(gVar, list, z);
    }

    @C11665v0(version = "1.4")
    /* renamed from: t */
    public C11522s mo22817t(Object obj, String str, KVariance kVariance, boolean z) {
        return new C11373v0(obj, str, kVariance, z);
    }
}
