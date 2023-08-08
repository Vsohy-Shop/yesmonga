package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.cursoradapter.widget.d */
public class C18523d extends C18522c {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: E0 */
    public int[] f47308E0;

    /* renamed from: F0 */
    public int f47309F0 = -1;

    /* renamed from: G0 */
    public C18524a f47310G0;

    /* renamed from: H0 */
    public C18525b f47311H0;

    /* renamed from: I0 */
    public String[] f47312I0;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: Z */
    public int[] f47313Z;

    /* renamed from: androidx.cursoradapter.widget.d$a */
    public interface C18524a {
        /* renamed from: a */
        CharSequence mo53414a(Cursor cursor);
    }

    /* renamed from: androidx.cursoradapter.widget.d$b */
    public interface C18525b {
        /* renamed from: a */
        boolean mo53415a(View view, Cursor cursor, int i);
    }

    @Deprecated
    public C18523d(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f47308E0 = iArr;
        this.f47312I0 = strArr;
        mo53405q(cursor, strArr);
    }

    /* renamed from: a */
    public CharSequence mo3281a(Cursor cursor) {
        C18524a aVar = this.f47310G0;
        if (aVar != null) {
            return aVar.mo53414a(cursor);
        }
        int i = this.f47309F0;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.mo3281a(cursor);
    }

    /* renamed from: e */
    public void mo3284e(View view, Context context, Cursor cursor) {
        boolean z;
        C18525b bVar = this.f47311H0;
        int[] iArr = this.f47308E0;
        int length = iArr.length;
        int[] iArr2 = this.f47313Z;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (bVar != null) {
                    z = bVar.mo53415a(findViewById, cursor, iArr2[i]);
                } else {
                    z = false;
                }
                if (z) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo53413y((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo53412x((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public Cursor mo53394m(Cursor cursor) {
        mo53405q(cursor, this.f47312I0);
        return super.mo53394m(cursor);
    }

    /* renamed from: p */
    public void mo53404p(Cursor cursor, String[] strArr, int[] iArr) {
        this.f47312I0 = strArr;
        this.f47308E0 = iArr;
        mo53405q(cursor, strArr);
        super.mo3282b(cursor);
    }

    /* renamed from: q */
    public final void mo53405q(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f47313Z;
            if (iArr == null || iArr.length != length) {
                this.f47313Z = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f47313Z[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f47313Z = null;
    }

    /* renamed from: r */
    public C18524a mo53406r() {
        return this.f47310G0;
    }

    /* renamed from: s */
    public int mo53407s() {
        return this.f47309F0;
    }

    /* renamed from: t */
    public C18525b mo53408t() {
        return this.f47311H0;
    }

    /* renamed from: u */
    public void mo53409u(C18524a aVar) {
        this.f47310G0 = aVar;
    }

    /* renamed from: v */
    public void mo53410v(int i) {
        this.f47309F0 = i;
    }

    /* renamed from: w */
    public void mo53411w(C18525b bVar) {
        this.f47311H0 = bVar;
    }

    /* renamed from: x */
    public void mo53412x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: y */
    public void mo53413y(TextView textView, String str) {
        textView.setText(str);
    }

    public C18523d(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f47308E0 = iArr;
        this.f47312I0 = strArr;
        mo53405q(cursor, strArr);
    }
}
