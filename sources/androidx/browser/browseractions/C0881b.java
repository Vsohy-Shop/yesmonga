package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import com.google.common.util.concurrent.C32487a;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: androidx.browser.browseractions.b */
public class C0881b extends BaseAdapter {

    /* renamed from: a */
    public final List<C0880a> f2734a;

    /* renamed from: b */
    public final Context f2735b;

    /* renamed from: androidx.browser.browseractions.b$a */
    public class C0882a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f2736a;

        /* renamed from: b */
        public final /* synthetic */ C0884c f2737b;

        /* renamed from: c */
        public final /* synthetic */ C32487a f2738c;

        public C0882a(String str, C0884c cVar, C32487a aVar) {
            this.f2736a = str;
            this.f2737b = cVar;
            this.f2738c = aVar;
        }

        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.f2736a, this.f2737b.f2742b.getText())) {
                try {
                    bitmap = (Bitmap) this.f2738c.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.f2737b.f2741a.setVisibility(0);
                    this.f2737b.f2741a.setImageBitmap(bitmap);
                    return;
                }
                this.f2737b.f2741a.setVisibility(4);
                this.f2737b.f2741a.setImageBitmap((Bitmap) null);
            }
        }
    }

    /* renamed from: androidx.browser.browseractions.b$b */
    public class C0883b implements Executor {
        public C0883b() {
        }

        public void execute(@C0359n0 Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: androidx.browser.browseractions.b$c */
    public static class C0884c {

        /* renamed from: a */
        public final ImageView f2741a;

        /* renamed from: b */
        public final TextView f2742b;

        public C0884c(ImageView imageView, TextView textView) {
            this.f2741a = imageView;
            this.f2742b = textView;
        }
    }

    public C0881b(List<C0880a> list, Context context) {
        this.f2734a = list;
        this.f2735b = context;
    }

    public int getCount() {
        return this.f2734a.size();
    }

    public Object getItem(int i) {
        return this.f2734a.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: androidx.browser.browseractions.b$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            java.util.List<androidx.browser.browseractions.a> r6 = r3.f2734a
            java.lang.Object r4 = r6.get(r4)
            androidx.browser.browseractions.a r4 = (androidx.browser.browseractions.C0880a) r4
            r6 = 0
            if (r5 != 0) goto L_0x003c
            android.content.Context r5 = r3.f2735b
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = androidx.browser.C0873a.C0877d.browser_actions_context_menu_row
            android.view.View r5 = r5.inflate(r0, r6)
            int r0 = androidx.browser.C0873a.C0876c.browser_actions_menu_item_icon
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r1 = androidx.browser.C0873a.C0876c.browser_actions_menu_item_text
            android.view.View r1 = r5.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r0 == 0) goto L_0x0034
            if (r1 == 0) goto L_0x0034
            androidx.browser.browseractions.b$c r2 = new androidx.browser.browseractions.b$c
            r2.<init>(r0, r1)
            r5.setTag(r2)
            goto L_0x0043
        L_0x0034:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Browser Actions fallback UI does not contain necessary Views."
            r4.<init>(r5)
            throw r4
        L_0x003c:
            java.lang.Object r0 = r5.getTag()
            r2 = r0
            androidx.browser.browseractions.b$c r2 = (androidx.browser.browseractions.C0881b.C0884c) r2
        L_0x0043:
            java.lang.String r0 = r4.mo3848e()
            android.widget.TextView r1 = r2.f2742b
            r1.setText(r0)
            int r1 = r4.mo3845b()
            if (r1 == 0) goto L_0x0066
            android.content.Context r0 = r3.f2735b
            android.content.res.Resources r0 = r0.getResources()
            int r4 = r4.mo3845b()
            android.graphics.drawable.Drawable r4 = androidx.core.content.res.C17465i.m80175g(r0, r4, r6)
            android.widget.ImageView r6 = r2.f2741a
            r6.setImageDrawable(r4)
            goto L_0x0093
        L_0x0066:
            android.net.Uri r1 = r4.mo3846c()
            if (r1 == 0) goto L_0x0088
            android.content.Context r6 = r3.f2735b
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r4 = r4.mo3846c()
            com.google.common.util.concurrent.a r4 = androidx.browser.browseractions.C0897f.m4056l(r6, r4)
            androidx.browser.browseractions.b$a r6 = new androidx.browser.browseractions.b$a
            r6.<init>(r0, r2, r4)
            androidx.browser.browseractions.b$b r0 = new androidx.browser.browseractions.b$b
            r0.<init>()
            r4.mo5489q(r6, r0)
            goto L_0x0093
        L_0x0088:
            android.widget.ImageView r4 = r2.f2741a
            r4.setImageBitmap(r6)
            android.widget.ImageView r4 = r2.f2741a
            r6 = 4
            r4.setVisibility(r6)
        L_0x0093:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.browser.browseractions.C0881b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
