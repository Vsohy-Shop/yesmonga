package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42511s9;
import com.google.android.gms.internal.mlkit_common.C42522t9;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.mlkit.common.model.d */
public abstract class C33920d {

    /* renamed from: e */
    public static final Map<BaseModel, String> f82316e;
    @RecentlyNonNull
    @C0344h1

    /* renamed from: f */
    public static final Map<BaseModel, String> f82317f;
    @C0363p0

    /* renamed from: a */
    public final String f82318a;
    @C0363p0

    /* renamed from: b */
    public final BaseModel f82319b;

    /* renamed from: c */
    public final ModelType f82320c;

    /* renamed from: d */
    public String f82321d;

    static {
        Class<BaseModel> cls = BaseModel.class;
        f82316e = new EnumMap(cls);
        f82317f = new EnumMap(cls);
    }

    @C40473a
    public C33920d(@C0363p0 String str, @C0363p0 BaseModel baseModel, @RecentlyNonNull ModelType modelType) {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z2 = false;
        if (baseModel == null) {
            z = false;
        } else {
            z = true;
        }
        C40843u.m166192b(isEmpty == z ? true : z2, "One of cloud model name and base model cannot be empty");
        this.f82318a = str;
        this.f82319b = baseModel;
        this.f82320c = modelType;
    }

    @C40473a
    /* renamed from: a */
    public boolean mo98677a(@RecentlyNonNull String str) {
        BaseModel baseModel = this.f82319b;
        if (baseModel == null) {
            return false;
        }
        return str.equals(f82316e.get(baseModel));
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public String mo98678b() {
        return this.f82321d;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: c */
    public String mo98679c() {
        return this.f82318a;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: d */
    public String mo98680d() {
        String str = this.f82318a;
        if (str != null) {
            return str;
        }
        return f82317f.get(this.f82319b);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: e */
    public ModelType mo98681e() {
        return this.f82320c;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C33920d)) {
            return false;
        }
        C33920d dVar = (C33920d) obj;
        if (!C40808s.m166010b(this.f82318a, dVar.f82318a) || !C40808s.m166010b(this.f82319b, dVar.f82319b) || !C40808s.m166010b(this.f82320c, dVar.f82320c)) {
            return false;
        }
        return true;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: f */
    public String mo98683f() {
        String str = this.f82318a;
        if (str != null) {
            return str;
        }
        String valueOf = String.valueOf(f82317f.get(this.f82319b));
        if (valueOf.length() != 0) {
            return "COM.GOOGLE.BASE_".concat(valueOf);
        }
        return new String("COM.GOOGLE.BASE_");
    }

    @C40473a
    /* renamed from: g */
    public boolean mo98684g() {
        return this.f82319b != null;
    }

    @C40473a
    /* renamed from: h */
    public void mo98685h(@RecentlyNonNull String str) {
        this.f82321d = str;
    }

    public int hashCode() {
        return C40808s.m166011c(this.f82318a, this.f82319b, this.f82320c);
    }

    @RecentlyNonNull
    public String toString() {
        C42511s9 b = C42522t9.m171675b("RemoteModel");
        b.mo137795a("modelName", this.f82318a);
        b.mo137795a("baseModel", this.f82319b);
        b.mo137795a("modelType", this.f82320c);
        return b.toString();
    }
}
