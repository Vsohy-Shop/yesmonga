package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.b */
public abstract class C18119b {

    /* renamed from: d */
    public static final String f46719d = "ActionProvider(support)";

    /* renamed from: a */
    public final Context f46720a;

    /* renamed from: b */
    public C18120a f46721b;

    /* renamed from: c */
    public C18121b f46722c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.b$a */
    public interface C18120a {
        /* renamed from: a */
        void mo2452a(boolean z);
    }

    /* renamed from: androidx.core.view.b$b */
    public interface C18121b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C18119b(@C0359n0 Context context) {
        this.f46720a = context;
    }

    @C0359n0
    /* renamed from: a */
    public Context mo52790a() {
        return this.f46720a;
    }

    /* renamed from: b */
    public boolean mo2227b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo2231c() {
        return true;
    }

    @C0359n0
    /* renamed from: d */
    public abstract View mo2228d();

    @C0359n0
    /* renamed from: e */
    public View mo2232e(@C0359n0 MenuItem menuItem) {
        return mo2228d();
    }

    /* renamed from: f */
    public boolean mo2229f() {
        return false;
    }

    /* renamed from: g */
    public void mo2230g(@C0359n0 SubMenu subMenu) {
    }

    /* renamed from: h */
    public boolean mo2233h() {
        return false;
    }

    /* renamed from: i */
    public void mo2234i() {
        if (this.f46722c != null && mo2233h()) {
            this.f46722c.onActionProviderVisibilityChanged(mo2231c());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public void mo52791j() {
        this.f46722c = null;
        this.f46721b = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public void mo52792k(@C0363p0 C18120a aVar) {
        this.f46721b = aVar;
    }

    /* renamed from: l */
    public void mo2235l(@C0363p0 C18121b bVar) {
        if (!(this.f46722c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.f46722c = bVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public void mo52793m(boolean z) {
        C18120a aVar = this.f46721b;
        if (aVar != null) {
            aVar.mo2452a(z);
        }
    }
}
