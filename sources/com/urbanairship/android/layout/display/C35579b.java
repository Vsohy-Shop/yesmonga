package com.urbanairship.android.layout.display;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.info.C35696x;
import com.urbanairship.android.layout.util.C35910d;
import com.urbanairship.android.layout.util.C35911e;
import com.urbanairship.app.C36030b;
import com.urbanairship.webkit.C9711g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.display.b */
public class C35579b {

    /* renamed from: a */
    public final C35580a f87973a;

    /* renamed from: b */
    public final C35696x f87974b;

    /* renamed from: c */
    public C36030b f87975c;

    /* renamed from: d */
    public C35700k f87976d;

    /* renamed from: e */
    public C35911e f87977e;

    /* renamed from: f */
    public C35910d<C9711g> f87978f;

    /* renamed from: com.urbanairship.android.layout.display.b$a */
    public interface C35580a {
        /* renamed from: a */
        void mo106604a(@C0359n0 Context context, @C0359n0 C35578a aVar);
    }

    public C35579b(@C0359n0 C35696x xVar, @C0359n0 C35580a aVar) {
        this.f87974b = xVar;
        this.f87973a = aVar;
    }

    /* renamed from: a */
    public void mo106599a(@C0359n0 Context context) {
        this.f87973a.mo106604a(context, new C35578a(this.f87974b, this.f87976d, this.f87975c, this.f87978f, this.f87977e));
    }

    @C0359n0
    /* renamed from: b */
    public C35579b mo106600b(@C0363p0 C35911e eVar) {
        this.f87977e = eVar;
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public C35579b mo106601c(C36030b bVar) {
        this.f87975c = bVar;
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public C35579b mo106602d(@C0363p0 C35700k kVar) {
        this.f87976d = kVar;
        return this;
    }

    @C0359n0
    /* renamed from: e */
    public C35579b mo106603e(@C0363p0 C35910d<C9711g> dVar) {
        this.f87978f = dVar;
        return this;
    }
}
