package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.fragment.app.n0 */
public class C19256n0 extends Fragment {

    /* renamed from: X */
    public static final int f49563X = 16711682;

    /* renamed from: Y */
    public static final int f49564Y = 16711683;

    /* renamed from: z */
    public static final int f49565z = 16711681;

    /* renamed from: a */
    public final Handler f49566a = new Handler();

    /* renamed from: b */
    public final Runnable f49567b = new C19257a();

    /* renamed from: c */
    public final AdapterView.OnItemClickListener f49568c = new C19258b();

    /* renamed from: d */
    public ListAdapter f49569d;

    /* renamed from: e */
    public ListView f49570e;

    /* renamed from: f */
    public View f49571f;

    /* renamed from: g */
    public TextView f49572g;

    /* renamed from: v */
    public View f49573v;

    /* renamed from: w */
    public View f49574w;

    /* renamed from: x */
    public CharSequence f49575x;

    /* renamed from: y */
    public boolean f49576y;

    /* renamed from: androidx.fragment.app.n0$a */
    public class C19257a implements Runnable {
        public C19257a() {
        }

        public void run() {
            ListView listView = C19256n0.this.f49570e;
            listView.focusableViewAvailable(listView);
        }
    }

    /* renamed from: androidx.fragment.app.n0$b */
    public class C19258b implements AdapterView.OnItemClickListener {
        public C19258b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C19256n0.this.mo57331N0((ListView) adapterView, view, i, j);
        }
    }

    /* renamed from: I0 */
    public final void mo57326I0() {
        if (this.f49570e == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f49570e = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(f49565z);
                    this.f49572g = textView;
                    if (textView == null) {
                        this.f49571f = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f49573v = view.findViewById(f49563X);
                    this.f49574w = view.findViewById(f49564Y);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f49570e = listView;
                        View view2 = this.f49571f;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        } else {
                            CharSequence charSequence = this.f49575x;
                            if (charSequence != null) {
                                this.f49572g.setText(charSequence);
                                this.f49570e.setEmptyView(this.f49572g);
                            }
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f49576y = true;
                this.f49570e.setOnItemClickListener(this.f49568c);
                ListAdapter listAdapter = this.f49569d;
                if (listAdapter != null) {
                    this.f49569d = null;
                    mo57334Q0(listAdapter);
                } else if (this.f49573v != null) {
                    mo57336S0(false, false);
                }
                this.f49566a.post(this.f49567b);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    @C0363p0
    /* renamed from: J0 */
    public ListAdapter mo57327J0() {
        return this.f49569d;
    }

    @C0359n0
    /* renamed from: K0 */
    public ListView mo57328K0() {
        mo57326I0();
        return this.f49570e;
    }

    /* renamed from: L0 */
    public long mo57329L0() {
        mo57326I0();
        return this.f49570e.getSelectedItemId();
    }

    /* renamed from: M0 */
    public int mo57330M0() {
        mo57326I0();
        return this.f49570e.getSelectedItemPosition();
    }

    /* renamed from: N0 */
    public void mo57331N0(@C0359n0 ListView listView, @C0359n0 View view, int i, long j) {
    }

    @C0359n0
    /* renamed from: O0 */
    public final ListAdapter mo57332O0() {
        ListAdapter J0 = mo57327J0();
        if (J0 != null) {
            return J0;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    /* renamed from: P0 */
    public void mo57333P0(@C0363p0 CharSequence charSequence) {
        mo57326I0();
        TextView textView = this.f49572g;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f49575x == null) {
                this.f49570e.setEmptyView(this.f49572g);
            }
            this.f49575x = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    /* renamed from: Q0 */
    public void mo57334Q0(@C0363p0 ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.f49569d != null) {
            z = true;
        } else {
            z = false;
        }
        this.f49569d = listAdapter;
        ListView listView = this.f49570e;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f49576y && !z) {
                if (requireView().getWindowToken() != null) {
                    z2 = true;
                }
                mo57336S0(true, z2);
            }
        }
    }

    /* renamed from: R0 */
    public void mo57335R0(boolean z) {
        mo57336S0(z, true);
    }

    /* renamed from: S0 */
    public final void mo57336S0(boolean z, boolean z2) {
        mo57326I0();
        View view = this.f49573v;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f49576y != z) {
            this.f49576y = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f49574w.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f49574w.clearAnimation();
                }
                this.f49573v.setVisibility(8);
                this.f49574w.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f49574w.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f49574w.clearAnimation();
            }
            this.f49573v.setVisibility(0);
            this.f49574w.setVisibility(8);
        }
    }

    /* renamed from: T0 */
    public void mo57337T0(boolean z) {
        mo57336S0(z, false);
    }

    /* renamed from: U0 */
    public void mo57338U0(int i) {
        mo57326I0();
        this.f49570e.setSelection(i);
    }

    @C0363p0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f49563X);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f49564Y);
        TextView textView = new TextView(requireContext);
        textView.setId(f49565z);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.f49566a.removeCallbacks(this.f49567b);
        this.f49570e = null;
        this.f49576y = false;
        this.f49574w = null;
        this.f49573v = null;
        this.f49571f = null;
        this.f49572g = null;
        super.onDestroyView();
    }

    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo57326I0();
    }
}
