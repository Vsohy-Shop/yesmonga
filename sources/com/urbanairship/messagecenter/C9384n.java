package com.urbanairship.messagecenter;

import android.animation.Animator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.urbanairship.C36050h;
import com.urbanairship.C36059m;
import com.urbanairship.messagecenter.C9353c;
import com.urbanairship.messagecenter.C9401y;
import com.urbanairship.messagecenter.webkit.C9399a;
import com.urbanairship.messagecenter.webkit.MessageWebView;
import com.urbanairship.webkit.C9704a;

/* renamed from: com.urbanairship.messagecenter.n */
public class C9384n extends Fragment {

    /* renamed from: w */
    public static final String f25674w = "messageReporting";

    /* renamed from: x */
    public static final int f25675x = 1;

    /* renamed from: y */
    public static final int f25676y = 2;

    /* renamed from: z */
    public static final int f25677z = 3;

    /* renamed from: a */
    public MessageWebView f25678a;

    /* renamed from: b */
    public View f25679b;

    /* renamed from: c */
    public C9371g f25680c;

    /* renamed from: d */
    public View f25681d;

    /* renamed from: e */
    public Button f25682e;

    /* renamed from: f */
    public TextView f25683f;

    /* renamed from: g */
    public Integer f25684g = null;

    /* renamed from: v */
    public C36050h f25685v;

    /* renamed from: com.urbanairship.messagecenter.n$a */
    public class C9385a extends C9399a {
        public C9385a() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (C9384n.this.f25684g != null) {
                C9384n.this.mo19049S0(2);
            } else if (C9384n.this.f25680c != null) {
                C9384n.this.f25680c.mo18992p0();
                C9384n.this.mo19050T0();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, @C0363p0 String str2) {
            if (C9384n.this.f25680c != null && str2 != null && str2.equals(C9384n.this.f25680c.mo18976Q())) {
                Integer unused = C9384n.this.f25684g = Integer.valueOf(i);
            }
        }
    }

    /* renamed from: com.urbanairship.messagecenter.n$b */
    public class C9386b implements View.OnClickListener {
        public C9386b() {
        }

        public void onClick(View view) {
            C9384n.this.mo19048R0();
        }
    }

    /* renamed from: com.urbanairship.messagecenter.n$c */
    public class C9387c implements C9353c.C9363j {
        public C9387c() {
        }

        /* renamed from: a */
        public void mo18950a(boolean z) {
            C9371g unused = C9384n.this.f25680c = C9372h.m35254H().mo18999B().mo18929l(C9384n.this.mo19046O0());
            if (!z) {
                C9384n.this.mo19049S0(1);
            } else if (C9384n.this.f25680c == null || C9384n.this.f25680c.mo18990n0()) {
                C9384n.this.mo19049S0(3);
            } else {
                C36059m.m148413i("Loading message: " + C9384n.this.f25680c.mo18977W(), new Object[0]);
                C9384n.this.f25678a.mo19077v(C9384n.this.f25680c);
            }
        }
    }

    @C0359n0
    /* renamed from: Q0 */
    public static C9384n m35337Q0(@C0363p0 String str) {
        C9384n nVar = new C9384n();
        Bundle bundle = new Bundle();
        bundle.putString(f25674w, str);
        nVar.setArguments(bundle);
        return nVar;
    }

    /* renamed from: N0 */
    public final void mo19045N0(@C0359n0 View view) {
        if (this.f25678a == null) {
            View findViewById = view.findViewById(16908301);
            this.f25679b = findViewById;
            if (findViewById != null) {
                MessageWebView messageWebView = (MessageWebView) view.findViewById(16908299);
                this.f25678a = messageWebView;
                if (messageWebView != null) {
                    this.f25681d = view.findViewById(C9401y.C9409h.error);
                    this.f25678a.setAlpha(0.0f);
                    this.f25678a.setWebViewClient(new C9385a());
                    this.f25678a.getSettings().setSupportMultipleWindows(true);
                    this.f25678a.setWebChromeClient(new C9704a(getActivity()));
                    Button button = (Button) view.findViewById(C9401y.C9409h.retry_button);
                    this.f25682e = button;
                    if (button != null) {
                        button.setOnClickListener(new C9386b());
                    }
                    this.f25683f = (TextView) view.findViewById(C9401y.C9409h.error_message);
                    return;
                }
                throw new RuntimeException("Your content must have a MessageWebView whose id attribute is 'android.R.id.message'");
            }
            throw new RuntimeException("Your content must have a progress View whose id attribute is 'android.R.id.progress'");
        }
    }

    @C0363p0
    /* renamed from: O0 */
    public String mo19046O0() {
        if (getArguments() == null) {
            return null;
        }
        return getArguments().getString(f25674w);
    }

    /* renamed from: P0 */
    public final void mo19047P0() {
        mo19051U0();
        this.f25684g = null;
        C9371g l = C9372h.m35254H().mo18999B().mo18929l(mo19046O0());
        this.f25680c = l;
        if (l == null) {
            C36059m.m148406b("Fetching messages.", new Object[0]);
            this.f25685v = C9372h.m35254H().mo18999B().mo18925h(new C9387c());
        } else if (l.mo18990n0()) {
            mo19049S0(3);
        } else {
            C36059m.m148413i("Loading message: %s", this.f25680c.mo18977W());
            this.f25678a.mo19077v(this.f25680c);
        }
    }

    /* renamed from: R0 */
    public void mo19048R0() {
        if (this.f25678a != null) {
            mo19047P0();
        }
    }

    /* renamed from: S0 */
    public void mo19049S0(int i) {
        if (this.f25681d != null) {
            if (i == 1 || i == 2) {
                Button button = this.f25682e;
                if (button != null) {
                    button.setVisibility(0);
                }
                TextView textView = this.f25683f;
                if (textView != null) {
                    textView.setText(C9401y.C9416o.ua_mc_failed_to_load);
                }
            } else if (i == 3) {
                Button button2 = this.f25682e;
                if (button2 != null) {
                    button2.setVisibility(8);
                }
                TextView textView2 = this.f25683f;
                if (textView2 != null) {
                    textView2.setText(C9401y.C9416o.ua_mc_no_longer_available);
                }
            }
            if (this.f25681d.getVisibility() == 8) {
                this.f25681d.setAlpha(0.0f);
                this.f25681d.setVisibility(0);
            }
            this.f25681d.animate().alpha(1.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
        View view = this.f25679b;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: T0 */
    public void mo19050T0() {
        MessageWebView messageWebView = this.f25678a;
        if (messageWebView != null) {
            messageWebView.animate().alpha(1.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
        View view = this.f25679b;
        if (view != null) {
            view.animate().alpha(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: U0 */
    public void mo19051U0() {
        View view = this.f25681d;
        if (view != null && view.getVisibility() == 0) {
            this.f25681d.animate().alpha(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
        MessageWebView messageWebView = this.f25678a;
        if (messageWebView != null) {
            messageWebView.animate().alpha(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
        View view2 = this.f25679b;
        if (view2 != null) {
            view2.animate().alpha(1.0f).setDuration(200).setListener((Animator.AnimatorListener) null);
        }
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        View inflate = layoutInflater.inflate(C9401y.C9412k.ua_fragment_message, viewGroup, false);
        mo19045N0(inflate);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f25678a = null;
        this.f25679b = null;
    }

    public void onPause() {
        super.onPause();
        this.f25678a.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f25678a.onResume();
    }

    public void onStart() {
        super.onStart();
        mo19047P0();
    }

    public void onStop() {
        super.onStop();
        C36050h hVar = this.f25685v;
        if (hVar != null) {
            hVar.cancel();
            this.f25685v = null;
        }
    }

    @C0346i
    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo19045N0(view);
    }
}
