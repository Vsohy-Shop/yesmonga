package com.urbanairship.messagecenter;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import androidx.fragment.app.Fragment;
import com.urbanairship.C36064q;
import com.urbanairship.messagecenter.C9396w;
import com.urbanairship.messagecenter.C9401y;
import com.urbanairship.util.C9676r0;
import java.util.List;

public class MessageCenterFragment extends Fragment {

    /* renamed from: w */
    public static final String f25489w = "currentMessageId";

    /* renamed from: x */
    public static final String f25490x = "currentMessagePosition";

    /* renamed from: y */
    public static final String f25491y = "listView";

    /* renamed from: z */
    public static final String f25492z = "pendingMessageId";

    /* renamed from: a */
    public C36064q<C9371g> f25493a;

    /* renamed from: b */
    public C9396w f25494b;

    /* renamed from: c */
    public boolean f25495c;

    /* renamed from: d */
    public boolean f25496d;

    /* renamed from: e */
    public String f25497e;

    /* renamed from: f */
    public int f25498f = -1;

    /* renamed from: g */
    public String f25499g;

    /* renamed from: v */
    public final C9370f f25500v = new C9344a();

    /* renamed from: com.urbanairship.messagecenter.MessageCenterFragment$a */
    public class C9344a implements C9370f {
        public C9344a() {
        }

        /* renamed from: a */
        public void mo18875a() {
            MessageCenterFragment.this.mo18884R0();
        }
    }

    /* renamed from: com.urbanairship.messagecenter.MessageCenterFragment$b */
    public class C9345b implements C9396w.C9398b {

        /* renamed from: a */
        public final /* synthetic */ Bundle f25502a;

        public C9345b(Bundle bundle) {
            this.f25502a = bundle;
        }

        /* renamed from: a */
        public void mo18892a(@C0359n0 AbsListView absListView) {
            absListView.onRestoreInstanceState(this.f25502a.getParcelable(MessageCenterFragment.f25491y));
        }
    }

    /* renamed from: com.urbanairship.messagecenter.MessageCenterFragment$c */
    public class C9346c implements C9396w.C9398b {

        /* renamed from: a */
        public final /* synthetic */ C9396w f25504a;

        /* renamed from: com.urbanairship.messagecenter.MessageCenterFragment$c$a */
        public class C9347a implements AdapterView.OnItemClickListener {
            public C9347a() {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C9371g T0 = C9346c.this.f25504a.mo19067T0(i);
                if (T0 != null) {
                    MessageCenterFragment.this.mo18882P0(T0.mo18977W());
                }
            }
        }

        public C9346c(C9396w wVar) {
            this.f25504a = wVar;
        }

        /* renamed from: a */
        public void mo18892a(@C0359n0 AbsListView absListView) {
            absListView.setOnItemClickListener(new C9347a());
            absListView.setMultiChoiceModeListener(new C9352b(this.f25504a));
            absListView.setChoiceMode(3);
            absListView.setSaveEnabled(false);
        }
    }

    /* renamed from: com.urbanairship.messagecenter.MessageCenterFragment$d */
    public static class C9348d extends Fragment {
        @C0359n0
        public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
            Context context = layoutInflater.getContext();
            View inflate = layoutInflater.inflate(C9401y.C9412k.ua_fragment_no_message_selected, viewGroup, false);
            View findViewById = inflate.findViewById(16908292);
            if (findViewById instanceof TextView) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C9401y.C9418q.MessageCenter, C9401y.C9404c.messageCenterStyle, C9401y.C9417p.MessageCenter);
                TextView textView = (TextView) findViewById;
                C9676r0.m36241a(layoutInflater.getContext(), textView, obtainStyledAttributes.getResourceId(C9401y.C9418q.MessageCenter_messageNotSelectedTextAppearance, 0));
                textView.setText(obtainStyledAttributes.getString(C9401y.C9418q.MessageCenter_messageNotSelectedText));
                obtainStyledAttributes.recycle();
            }
            return inflate;
        }
    }

    @C0359n0
    /* renamed from: M0 */
    public static MessageCenterFragment m35107M0(@C0363p0 String str) {
        MessageCenterFragment messageCenterFragment = new MessageCenterFragment();
        Bundle bundle = new Bundle();
        bundle.putString(C9384n.f25674w, str);
        messageCenterFragment.setArguments(bundle);
        return messageCenterFragment;
    }

    /* renamed from: J0 */
    public void mo18877J0(@C0359n0 C9396w wVar) {
        wVar.mo19065R0(new C9346c(wVar));
    }

    /* renamed from: K0 */
    public final void mo18878K0(@C0359n0 View view) {
        if (getActivity() != null && !this.f25496d) {
            this.f25496d = true;
            int i = C9401y.C9409h.message_list_container;
            if (view.findViewById(i) != null) {
                this.f25494b = new C9396w();
                getChildFragmentManager().mo56909u().mo57202D(i, this.f25494b, "messageList").mo57052q();
                if (view.findViewById(C9401y.C9409h.message_container) != null) {
                    this.f25495c = true;
                    LinearLayout linearLayout = (LinearLayout) view.findViewById(C9401y.C9409h.container);
                    TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes((AttributeSet) null, C9401y.C9418q.MessageCenter, C9401y.C9404c.messageCenterStyle, C9401y.C9417p.MessageCenter);
                    int i2 = C9401y.C9418q.MessageCenter_messageCenterDividerColor;
                    if (obtainStyledAttributes.hasValue(i2)) {
                        C17549d.m80452n(linearLayout.getDividerDrawable(), obtainStyledAttributes.getColor(i2, -16777216));
                        C17549d.m80454p(linearLayout.getDividerDrawable(), PorterDuff.Mode.SRC);
                    }
                    obtainStyledAttributes.recycle();
                    String str = this.f25497e;
                    if (str != null) {
                        this.f25494b.mo19070Y0(str);
                    }
                } else {
                    this.f25495c = false;
                }
                mo18877J0(this.f25494b);
                return;
            }
            throw new RuntimeException("Content must have a place holder view whose id attribute is 'R.id.message_list_container'");
        }
    }

    @C0359n0
    /* renamed from: L0 */
    public final List<C9371g> mo18879L0() {
        return C9372h.m35254H().mo18999B().mo18933p(this.f25493a);
    }

    /* renamed from: N0 */
    public void mo18880N0(@C0363p0 String str) {
        if (isResumed()) {
            mo18882P0(str);
        } else {
            this.f25499g = str;
        }
    }

    /* renamed from: O0 */
    public void mo18881O0(@C0363p0 C36064q<C9371g> qVar) {
        this.f25493a = qVar;
    }

    /* renamed from: P0 */
    public void mo18882P0(@C0363p0 String str) {
        String str2;
        Fragment fragment;
        if (getContext() != null) {
            C9371g l = C9372h.m35254H().mo18999B().mo18929l(str);
            if (l == null) {
                this.f25498f = -1;
            } else {
                this.f25498f = mo18879L0().indexOf(l);
            }
            this.f25497e = str;
            if (this.f25494b != null) {
                if (this.f25495c) {
                    if (str == null) {
                        str2 = "EMPTY_MESSAGE";
                    } else {
                        str2 = str;
                    }
                    if (getChildFragmentManager().mo56903s0(str2) == null) {
                        if (str == null) {
                            fragment = new C9348d();
                        } else {
                            fragment = C9384n.m35337Q0(str);
                        }
                        getChildFragmentManager().mo56909u().mo57202D(C9401y.C9409h.message_container, fragment, str2).mo57052q();
                        this.f25494b.mo19070Y0(str);
                    }
                } else if (str != null) {
                    mo18883Q0(getContext(), str);
                }
            }
        }
    }

    /* renamed from: Q0 */
    public void mo18883Q0(@C0359n0 Context context, @C0359n0 String str) {
        Intent data = new Intent().setPackage(context.getPackageName()).addFlags(805306368).setData(Uri.fromParts("message", str, (String) null));
        data.setAction(C9372h.f25640n);
        if (data.resolveActivity(context.getPackageManager()) == null) {
            data.setClass(context, MessageActivity.class);
        }
        context.startActivity(data);
    }

    /* renamed from: R0 */
    public final void mo18884R0() {
        C9371g l = C9372h.m35254H().mo18999B().mo18929l(this.f25497e);
        List<C9371g> L0 = mo18879L0();
        if (this.f25495c && this.f25498f != -1 && !L0.contains(l)) {
            if (L0.size() == 0) {
                this.f25497e = null;
                this.f25498f = -1;
            } else {
                int min = Math.min(L0.size() - 1, this.f25498f);
                this.f25498f = min;
                this.f25497e = L0.get(min).mo18977W();
            }
            if (this.f25495c) {
                mo18882P0(this.f25497e);
            }
        }
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f25498f = bundle.getInt(f25490x, -1);
            this.f25497e = bundle.getString(f25489w, (String) null);
            this.f25499g = bundle.getString(f25492z, (String) null);
        } else if (getArguments() != null) {
            this.f25499g = getArguments().getString(C9384n.f25674w);
        }
    }

    @C0359n0
    public View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        View inflate = layoutInflater.inflate(C9401y.C9412k.ua_fragment_mc, viewGroup, false);
        mo18878K0(inflate);
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f25496d = false;
    }

    public void onPause() {
        super.onPause();
        C9372h.m35254H().mo18999B().mo18916E(this.f25500v);
    }

    public void onResume() {
        super.onResume();
        if (this.f25495c) {
            C9372h.m35254H().mo18999B().mo18920c(this.f25500v);
        }
        mo18884R0();
        String str = this.f25499g;
        if (str != null) {
            mo18882P0(str);
            this.f25499g = null;
        }
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        bundle.putString(f25489w, this.f25497e);
        bundle.putInt(f25490x, this.f25498f);
        bundle.putString(f25492z, this.f25499g);
        C9396w wVar = this.f25494b;
        if (!(wVar == null || wVar.mo19064Q0() == null)) {
            bundle.putParcelable(f25491y, this.f25494b.mo19064Q0().onSaveInstanceState());
        }
        super.onSaveInstanceState(bundle);
    }

    @C0346i
    public void onViewCreated(@C0359n0 View view, @C0363p0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo18878K0(view);
        this.f25494b.mo19071Z0(this.f25493a);
        if (bundle != null && bundle.containsKey(f25491y)) {
            this.f25494b.mo19065R0(new C9345b(bundle));
        }
    }
}
