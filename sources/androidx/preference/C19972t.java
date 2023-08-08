package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18019a;
import androidx.core.view.accessibility.C18065l0;
import androidx.recyclerview.widget.C20102a0;
import androidx.recyclerview.widget.RecyclerView;

@Deprecated
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.preference.t */
public class C19972t extends C20102a0 {

    /* renamed from: f */
    public final RecyclerView f51115f;

    /* renamed from: g */
    public final C18019a f51116g = super.mo59213n();

    /* renamed from: h */
    public final C18019a f51117h = new C19973a();

    /* renamed from: androidx.preference.t$a */
    public class C19973a extends C18019a {
        public C19973a() {
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            Preference n;
            C19972t.this.f51116g.mo19938g(view, l0Var);
            int p0 = C19972t.this.f51115f.mo59608p0(view);
            RecyclerView.Adapter adapter = C19972t.this.f51115f.getAdapter();
            if ((adapter instanceof C19953n) && (n = ((C19953n) adapter).mo59147n(p0)) != null) {
                n.mo58874c2(l0Var);
            }
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            return C19972t.this.f51116g.mo19939j(view, i, bundle);
        }
    }

    public C19972t(@C0359n0 RecyclerView recyclerView) {
        super(recyclerView);
        this.f51115f = recyclerView;
    }

    @C0359n0
    /* renamed from: n */
    public C18019a mo59213n() {
        return this.f51117h;
    }
}
