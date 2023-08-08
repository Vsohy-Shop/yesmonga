package com.urbanairship.automation.storage;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.storage.b */
public class C8938b extends C8937a {

    /* renamed from: a */
    public final C8937a f23954a;

    public C8938b(@C0359n0 C8937a aVar) {
        this.f23954a = aVar;
    }

    /* renamed from: b */
    public void mo17638b(@C0359n0 C8954h hVar) {
        try {
            this.f23954a.mo17638b(hVar);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to delete schedule %s", hVar);
        }
    }

    @C0359n0
    /* renamed from: d */
    public List<C8946e> mo17640d() {
        try {
            return this.f23954a.mo17640d();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get active expired schedules", new Object[0]);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: e */
    public List<C8956j> mo17641e(int i) {
        try {
            return this.f23954a.mo17641e(i);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get active triggers %s", Integer.valueOf(i));
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: f */
    public List<C8956j> mo17642f(int i, @C0359n0 String str) {
        try {
            return this.f23954a.mo17642f(i, str);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get active triggers %s %s", Integer.valueOf(i), str);
            return Collections.emptyList();
        }
    }

    @C0363p0
    /* renamed from: g */
    public C8946e mo17643g(@C0359n0 String str) {
        try {
            return this.f23954a.mo17643g(str);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedule with id %s", str);
            return null;
        }
    }

    @C0363p0
    /* renamed from: h */
    public C8946e mo17644h(@C0359n0 String str, @C0359n0 String str2) {
        try {
            return this.f23954a.mo17644h(str, str2);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedule with id %s type %s", str, str2);
            return null;
        }
    }

    /* renamed from: i */
    public int mo17645i() {
        try {
            return this.f23954a.mo17645i();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedule count", new Object[0]);
            return -1;
        }
    }

    @C0359n0
    /* renamed from: j */
    public List<C8946e> mo17646j() {
        try {
            return this.f23954a.mo17646j();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules", new Object[0]);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: k */
    public List<C8946e> mo17647k(@C0359n0 Collection<String> collection) {
        try {
            return this.f23954a.mo17647k(collection);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules with ids %s", collection);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: l */
    public List<C8946e> mo17648l(@C0359n0 Collection<String> collection, @C0359n0 String str) {
        try {
            return this.f23954a.mo17648l(collection, str);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules with ids %s type %s", collection, str);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: m */
    public List<C8946e> mo17649m(@C0359n0 String str) {
        try {
            return this.f23954a.mo17649m(str);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules by type %s", str);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: n */
    public List<C8946e> mo17650n(@C0359n0 String str) {
        try {
            return this.f23954a.mo17650n(str);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules with group %s", str);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: o */
    public List<C8946e> mo17651o(@C0359n0 String str, @C0359n0 String str2) {
        try {
            return this.f23954a.mo17651o(str, str2);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules with group %s type %s", str, str2);
            return Collections.emptyList();
        }
    }

    @C0359n0
    /* renamed from: p */
    public List<C8946e> mo17652p(int... iArr) {
        try {
            return this.f23954a.mo17652p(iArr);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to get schedules with state %s", iArr);
            return Collections.emptyList();
        }
    }

    /* renamed from: r */
    public void mo17654r(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list) {
        try {
            this.f23954a.mo17654r(hVar, list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to insert schedule %s triggers %s", hVar, list);
        }
    }

    /* renamed from: u */
    public void mo17657u(@C0359n0 C8954h hVar, @C0359n0 List<C8956j> list) {
        try {
            this.f23954a.mo17657u(hVar, list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to update schedule %s triggers %s", hVar, list);
        }
    }

    /* renamed from: w */
    public void mo17659w(@C0359n0 List<C8956j> list) {
        try {
            this.f23954a.mo17659w(list);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to update triggers %s", list);
        }
    }
}
