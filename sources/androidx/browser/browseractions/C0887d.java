package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.browser.C0873a;
import androidx.compose.runtime.C8698y1;
import androidx.core.widget.C18496q;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: androidx.browser.browseractions.d */
public class C0887d implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public static final String f2748f = "BrowserActionskMenuUi";

    /* renamed from: a */
    public final Context f2749a;

    /* renamed from: b */
    public final Uri f2750b;

    /* renamed from: c */
    public final List<C0880a> f2751c;
    @C0363p0

    /* renamed from: d */
    public C0891d f2752d;
    @C0363p0

    /* renamed from: e */
    public C0885c f2753e;

    /* renamed from: androidx.browser.browseractions.d$a */
    public class C0888a implements Runnable {
        public C0888a() {
        }

        public void run() {
            ((ClipboardManager) C0887d.this.f2749a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", C0887d.this.f2750b.toString()));
            Toast.makeText(C0887d.this.f2749a, C0887d.this.f2749a.getString(C0873a.C0878e.copy_toast_msg), 0).show();
        }
    }

    /* renamed from: androidx.browser.browseractions.d$b */
    public class C0889b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public final /* synthetic */ View f2755a;

        public C0889b(View view) {
            this.f2755a = view;
        }

        public void onShow(DialogInterface dialogInterface) {
            C0891d dVar = C0887d.this.f2752d;
            if (dVar != null) {
                dVar.mo3871a(this.f2755a);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.d$c */
    public class C0890c implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f2757a;

        public C0890c(TextView textView) {
            this.f2757a = textView;
        }

        public void onClick(View view) {
            if (C18496q.m83737k(this.f2757a) == Integer.MAX_VALUE) {
                this.f2757a.setMaxLines(1);
                this.f2757a.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.f2757a.setMaxLines(Integer.MAX_VALUE);
            this.f2757a.setEllipsize((TextUtils.TruncateAt) null);
        }
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.browser.browseractions.d$d */
    public interface C0891d {
        /* renamed from: a */
        void mo3871a(View view);
    }

    public C0887d(@C0359n0 Context context, @C0359n0 Uri uri, @C0359n0 List<C0880a> list) {
        this.f2749a = context;
        this.f2750b = uri;
        this.f2751c = mo3861b(list);
    }

    /* renamed from: a */
    public final Runnable mo3860a() {
        return new C0888a();
    }

    @C0359n0
    /* renamed from: b */
    public final List<C0880a> mo3861b(List<C0880a> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0880a(this.f2749a.getString(C0873a.C0878e.fallback_menu_item_open_in_browser), mo3862c()));
        arrayList.add(new C0880a(this.f2749a.getString(C0873a.C0878e.fallback_menu_item_copy_link), mo3860a()));
        arrayList.add(new C0880a(this.f2749a.getString(C0873a.C0878e.fallback_menu_item_share_link), mo3863d()));
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public final PendingIntent mo3862c() {
        return PendingIntent.getActivity(this.f2749a, 0, new Intent("android.intent.action.VIEW", this.f2750b), C8698y1.f23302n);
    }

    /* renamed from: d */
    public final PendingIntent mo3863d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f2750b.toString());
        intent.setType("text/plain");
        return PendingIntent.getActivity(this.f2749a, 0, intent, C8698y1.f23302n);
    }

    /* renamed from: e */
    public void mo3864e() {
        View inflate = LayoutInflater.from(this.f2749a).inflate(C0873a.C0877d.browser_actions_context_menu_page, (ViewGroup) null);
        C0885c cVar = new C0885c(this.f2749a, mo3865f(inflate));
        this.f2753e = cVar;
        cVar.setContentView(inflate);
        if (this.f2752d != null) {
            this.f2753e.setOnShowListener(new C0889b(inflate));
        }
        this.f2753e.show();
    }

    /* renamed from: f */
    public final BrowserActionsFallbackMenuView mo3865f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(C0873a.C0876c.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(C0873a.C0876c.browser_actions_header_text);
        textView.setText(this.f2750b.toString());
        textView.setOnClickListener(new C0890c(textView));
        ListView listView = (ListView) view.findViewById(C0873a.C0876c.browser_actions_menu_items);
        listView.setAdapter(new C0881b(this.f2751c, this.f2749a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: g */
    public void mo3866g(@C0363p0 C0891d dVar) {
        this.f2752d = dVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0880a aVar = this.f2751c.get(i);
        if (aVar.mo3844a() != null) {
            try {
                aVar.mo3844a().send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else if (aVar.mo3847d() != null) {
            aVar.mo3847d().run();
        }
        C0885c cVar = this.f2753e;
        if (cVar != null) {
            cVar.dismiss();
        }
    }
}
