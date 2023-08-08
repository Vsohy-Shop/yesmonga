package androidx.fragment.app;

import androidx.annotation.C0363p0;
import androidx.lifecycle.C19392a1;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* renamed from: androidx.fragment.app.y */
public class C19280y {
    @C0363p0

    /* renamed from: a */
    public final Collection<Fragment> f49618a;
    @C0363p0

    /* renamed from: b */
    public final Map<String, C19280y> f49619b;
    @C0363p0

    /* renamed from: c */
    public final Map<String, C19392a1> f49620c;

    public C19280y(@C0363p0 Collection<Fragment> collection, @C0363p0 Map<String, C19280y> map, @C0363p0 Map<String, C19392a1> map2) {
        this.f49618a = collection;
        this.f49619b = map;
        this.f49620c = map2;
    }

    @C0363p0
    /* renamed from: a */
    public Map<String, C19280y> mo57398a() {
        return this.f49619b;
    }

    @C0363p0
    /* renamed from: b */
    public Collection<Fragment> mo57399b() {
        return this.f49618a;
    }

    @C0363p0
    /* renamed from: c */
    public Map<String, C19392a1> mo57400c() {
        return this.f49620c;
    }

    /* renamed from: d */
    public boolean mo57401d(Fragment fragment) {
        Collection<Fragment> collection = this.f49618a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
