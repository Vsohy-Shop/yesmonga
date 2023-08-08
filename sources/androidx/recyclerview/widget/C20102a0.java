package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18089u0;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.a0 */
public class C20102a0 extends C18019a {

    /* renamed from: d */
    public final RecyclerView f51705d;

    /* renamed from: e */
    public final C20103a f51706e;

    /* renamed from: androidx.recyclerview.widget.a0$a */
    public static class C20103a extends C18019a {

        /* renamed from: d */
        public final C20102a0 f51707d;

        /* renamed from: e */
        public Map<View, C18019a> f51708e = new WeakHashMap();

        public C20103a(@C0359n0 C20102a0 a0Var) {
            this.f51707d = a0Var;
        }

        /* renamed from: a */
        public boolean mo52489a(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                return aVar.mo52489a(view, accessibilityEvent);
            }
            return super.mo52489a(view, accessibilityEvent);
        }

        @C0363p0
        /* renamed from: b */
        public C18089u0 mo45416b(@C0359n0 View view) {
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                return aVar.mo45416b(view);
            }
            return super.mo45416b(view);
        }

        /* renamed from: f */
        public void mo52492f(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                aVar.mo52492f(view, accessibilityEvent);
            } else {
                super.mo52492f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            if (this.f51707d.mo60227o() || this.f51707d.f51705d.getLayoutManager() == null) {
                super.mo19938g(view, l0Var);
                return;
            }
            this.f51707d.f51705d.getLayoutManager().mo59949h1(view, l0Var);
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                aVar.mo19938g(view, l0Var);
            } else {
                super.mo19938g(view, l0Var);
            }
        }

        /* renamed from: h */
        public void mo52493h(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                aVar.mo52493h(view, accessibilityEvent);
            } else {
                super.mo52493h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo52494i(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            C18019a aVar = this.f51708e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo52494i(viewGroup, view, accessibilityEvent);
            }
            return super.mo52494i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            if (this.f51707d.mo60227o() || this.f51707d.f51705d.getLayoutManager() == null) {
                return super.mo19939j(view, i, bundle);
            }
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                if (aVar.mo19939j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo19939j(view, i, bundle)) {
                return true;
            }
            return this.f51707d.f51705d.getLayoutManager().mo59869B1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo52496l(@C0359n0 View view, int i) {
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                aVar.mo52496l(view, i);
            } else {
                super.mo52496l(view, i);
            }
        }

        /* renamed from: m */
        public void mo52497m(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            C18019a aVar = this.f51708e.get(view);
            if (aVar != null) {
                aVar.mo52497m(view, accessibilityEvent);
            } else {
                super.mo52497m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        public C18019a mo60228n(View view) {
            return this.f51708e.remove(view);
        }

        /* renamed from: o */
        public void mo60229o(View view) {
            C18019a E = C18196h2.m82484E(view);
            if (E != null && E != this) {
                this.f51708e.put(view, E);
            }
        }
    }

    public C20102a0(@C0359n0 RecyclerView recyclerView) {
        this.f51705d = recyclerView;
        C18019a n = mo59213n();
        if (n == null || !(n instanceof C20103a)) {
            this.f51706e = new C20103a(this);
        } else {
            this.f51706e = (C20103a) n;
        }
    }

    /* renamed from: f */
    public void mo52492f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo52492f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo60227o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo59399d1(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo19938g(View view, C18065l0 l0Var) {
        super.mo19938g(view, l0Var);
        if (!mo60227o() && this.f51705d.getLayoutManager() != null) {
            this.f51705d.getLayoutManager().mo59938f1(l0Var);
        }
    }

    /* renamed from: j */
    public boolean mo19939j(View view, int i, Bundle bundle) {
        if (super.mo19939j(view, i, bundle)) {
            return true;
        }
        if (mo60227o() || this.f51705d.getLayoutManager() == null) {
            return false;
        }
        return this.f51705d.getLayoutManager().mo59985z1(i, bundle);
    }

    @C0359n0
    /* renamed from: n */
    public C18019a mo59213n() {
        return this.f51706e;
    }

    /* renamed from: o */
    public boolean mo60227o() {
        return this.f51705d.mo59469D0();
    }
}
