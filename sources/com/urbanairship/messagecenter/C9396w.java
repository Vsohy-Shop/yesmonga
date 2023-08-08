package com.urbanairship.messagecenter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.graphics.drawable.C17549d;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.urbanairship.C36050h;
import com.urbanairship.C36064q;
import com.urbanairship.messagecenter.C9401y;
import com.urbanairship.util.C9676r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.urbanairship.messagecenter.w */
public class C9396w extends Fragment {

    /* renamed from: a */
    public SwipeRefreshLayout f25699a;

    /* renamed from: b */
    public AbsListView f25700b;

    /* renamed from: c */
    public C9353c f25701c;

    /* renamed from: d */
    public C9400x f25702d;

    /* renamed from: e */
    public C36050h f25703e;

    /* renamed from: f */
    public String f25704f;

    /* renamed from: g */
    public C36064q<C9371g> f25705g;

    /* renamed from: v */
    public final List<C9398b> f25706v = new ArrayList();
    @C0375v

    /* renamed from: w */
    public int f25707w = C9401y.C9408g.ua_ic_image_placeholder;

    /* renamed from: x */
    public final C9370f f25708x = new C9391r(this);

    /* renamed from: com.urbanairship.messagecenter.w$a */
    public class C9397a extends C9400x {

        /* renamed from: d */
        public final /* synthetic */ List f25709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9397a(Context context, int i, List list) {
            super(context, i);
            this.f25709d = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m35370f(C9371g gVar, int i, View view) {
            mo19076g(gVar.mo18977W(), i);
        }

        /* renamed from: a */
        public void mo19074a(@C0359n0 View view, @C0359n0 C9371g gVar, int i) {
            if (view instanceof MessageItemView) {
                MessageItemView messageItemView = (MessageItemView) view;
                messageItemView.setSelectionListener(new C9395v(this, gVar, i));
                messageItemView.mo18898j(gVar, C9396w.this.f25707w, mo19075e(gVar));
                messageItemView.setHighlighted(gVar.mo18977W().equals(C9396w.this.f25704f));
            }
        }

        /* renamed from: e */
        public final boolean mo19075e(@C0359n0 C9371g gVar) {
            return this.f25709d.contains(gVar.mo18977W());
        }

        /* renamed from: g */
        public final void mo19076g(String str, int i) {
            AbsListView Q0 = C9396w.this.mo19064Q0();
            if (Q0 != null) {
                boolean z = !Q0.isItemChecked(i);
                Q0.setItemChecked(i, z);
                if (z) {
                    this.f25709d.add(str);
                } else {
                    this.f25709d.remove(str);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.w$b */
    public interface C9398b {
        /* renamed from: a */
        void mo18892a(@C0359n0 AbsListView absListView);
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public /* synthetic */ void m35356V0(AdapterView adapterView, View view, int i, long j) {
        C9371g T0 = mo19067T0(i);
        if (T0 != null) {
            C9372h.m35254H().mo19005J(T0.mo18977W());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ void m35357W0(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.f25699a;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    @C0359n0
    /* renamed from: O0 */
    public C9400x mo19062O0(@C0359n0 Context context) {
        return new C9397a(context, C9401y.C9412k.ua_item_mc, new ArrayList());
    }

    /* renamed from: P0 */
    public final void mo19063P0(@C0359n0 View view) {
        if (getContext() != null && this.f25700b == null) {
            if (view instanceof AbsListView) {
                this.f25700b = (AbsListView) view;
            } else {
                this.f25700b = (AbsListView) view.findViewById(16908298);
            }
            if (this.f25700b != null) {
                if (mo19066S0() != null) {
                    this.f25700b.setAdapter(mo19066S0());
                }
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C9401y.C9409h.swipe_container);
                this.f25699a = swipeRefreshLayout;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setOnRefreshListener(new C9392s(this));
                }
                View findViewById = view.findViewById(16908292);
                TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes((AttributeSet) null, C9401y.C9418q.MessageCenter, C9401y.C9404c.messageCenterStyle, C9401y.C9417p.MessageCenter);
                if (findViewById instanceof TextView) {
                    TextView textView = (TextView) findViewById;
                    C9676r0.m36241a(getContext(), textView, obtainStyledAttributes.getResourceId(C9401y.C9418q.MessageCenter_messageCenterEmptyMessageTextAppearance, -1));
                    textView.setText(obtainStyledAttributes.getString(C9401y.C9418q.MessageCenter_messageCenterEmptyMessageText));
                }
                AbsListView absListView = this.f25700b;
                if (absListView instanceof ListView) {
                    ListView listView = (ListView) absListView;
                    int i = C9401y.C9418q.MessageCenter_messageCenterDividerColor;
                    if (obtainStyledAttributes.hasValue(i) && listView.getDivider() != null) {
                        C17549d.m80452n(listView.getDivider(), obtainStyledAttributes.getColor(i, -16777216));
                        C17549d.m80454p(listView.getDivider(), PorterDuff.Mode.SRC);
                    }
                }
                this.f25707w = obtainStyledAttributes.getResourceId(C9401y.C9418q.MessageCenter_messageCenterItemIconPlaceholder, this.f25707w);
                obtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        }
    }

    @C0363p0
    /* renamed from: Q0 */
    public AbsListView mo19064Q0() {
        return this.f25700b;
    }

    @C0353k0
    /* renamed from: R0 */
    public void mo19065R0(@C0359n0 C9398b bVar) {
        AbsListView absListView = this.f25700b;
        if (absListView != null) {
            bVar.mo18892a(absListView);
        } else {
            this.f25706v.add(bVar);
        }
    }

    @C0363p0
    /* renamed from: S0 */
    public C9400x mo19066S0() {
        if (this.f25702d == null) {
            if (getContext() == null) {
                return null;
            }
            this.f25702d = mo19062O0(getContext());
        }
        return this.f25702d;
    }

    @C0363p0
    /* renamed from: T0 */
    public C9371g mo19067T0(int i) {
        C9400x xVar = this.f25702d;
        if (xVar == null || xVar.getCount() <= i) {
            return null;
        }
        return (C9371g) this.f25702d.getItem(i);
    }

    /* renamed from: U0 */
    public final List<C9371g> mo19068U0() {
        return this.f25701c.mo18933p(this.f25705g);
    }

    /* renamed from: X0 */
    public final void mo19069X0() {
        C36050h hVar = this.f25703e;
        if (hVar != null) {
            hVar.cancel();
        }
        this.f25703e = this.f25701c.mo18925h(new C9393t(this));
        SwipeRefreshLayout swipeRefreshLayout = this.f25699a;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
    }

    /* renamed from: Y0 */
    public void mo19070Y0(@C0363p0 String str) {
        String str2 = this.f25704f;
        if (str2 != null || str != null) {
            if (str2 == null || !str2.equals(str)) {
                this.f25704f = str;
                if (mo19066S0() != null) {
                    mo19066S0().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: Z0 */
    public void mo19071Z0(C36064q<C9371g> qVar) {
        this.f25705g = qVar;
        if (mo19066S0() != null) {
            mo19072a1();
        }
    }

    /* renamed from: a1 */
    public final void mo19072a1() {
        if (mo19066S0() != null) {
            mo19066S0().mo19081c(mo19068U0());
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        this.f25701c = C9372h.m35254H().mo18999B();
        mo19072a1();
    }

    @C0363p0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        View inflate = layoutInflater.inflate(C9401y.C9412k.ua_fragment_message_list, viewGroup, false);
        mo19063P0(inflate);
        if (mo19064Q0() == null) {
            return inflate;
        }
        mo19064Q0().setOnItemClickListener(new C9394u(this));
        View findViewById = inflate.findViewById(16908292);
        if (findViewById != null) {
            this.f25700b.setEmptyView(findViewById);
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f25706v.clear();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f25700b.setChoiceMode(0);
        this.f25700b = null;
        this.f25699a = null;
    }

    public void onPause() {
        super.onPause();
        this.f25701c.mo18916E(this.f25708x);
        C36050h hVar = this.f25703e;
        if (hVar != null) {
            hVar.cancel();
        }
    }

    public void onResume() {
        super.onResume();
        this.f25701c.mo18920c(this.f25708x);
        mo19072a1();
        this.f25701c.mo18926i();
        if (mo19064Q0() != null) {
            mo19064Q0().invalidate();
        }
    }

    @C0346i
    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo19063P0(view);
        Iterator it = new ArrayList(this.f25706v).iterator();
        while (it.hasNext()) {
            ((C9398b) it.next()).mo18892a(this.f25700b);
        }
        this.f25706v.clear();
    }
}
