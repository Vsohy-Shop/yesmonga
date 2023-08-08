package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C18196h2;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public class AlertController {

    /* renamed from: A */
    public NestedScrollView f872A;

    /* renamed from: B */
    public int f873B = 0;

    /* renamed from: C */
    public Drawable f874C;

    /* renamed from: D */
    public ImageView f875D;

    /* renamed from: E */
    public TextView f876E;

    /* renamed from: F */
    public TextView f877F;

    /* renamed from: G */
    public View f878G;

    /* renamed from: H */
    public ListAdapter f879H;

    /* renamed from: I */
    public int f880I = -1;

    /* renamed from: J */
    public int f881J;

    /* renamed from: K */
    public int f882K;

    /* renamed from: L */
    public int f883L;

    /* renamed from: M */
    public int f884M;

    /* renamed from: N */
    public int f885N;

    /* renamed from: O */
    public int f886O;

    /* renamed from: P */
    public boolean f887P;

    /* renamed from: Q */
    public int f888Q = 0;

    /* renamed from: R */
    public Handler f889R;

    /* renamed from: S */
    public final View.OnClickListener f890S = new C0401a();

    /* renamed from: a */
    public final Context f891a;

    /* renamed from: b */
    public final C0492q f892b;

    /* renamed from: c */
    public final Window f893c;

    /* renamed from: d */
    public final int f894d;

    /* renamed from: e */
    public CharSequence f895e;

    /* renamed from: f */
    public CharSequence f896f;

    /* renamed from: g */
    public ListView f897g;

    /* renamed from: h */
    public View f898h;

    /* renamed from: i */
    public int f899i;

    /* renamed from: j */
    public int f900j;

    /* renamed from: k */
    public int f901k;

    /* renamed from: l */
    public int f902l;

    /* renamed from: m */
    public int f903m;

    /* renamed from: n */
    public boolean f904n = false;

    /* renamed from: o */
    public Button f905o;

    /* renamed from: p */
    public CharSequence f906p;

    /* renamed from: q */
    public Message f907q;

    /* renamed from: r */
    public Drawable f908r;

    /* renamed from: s */
    public Button f909s;

    /* renamed from: t */
    public CharSequence f910t;

    /* renamed from: u */
    public Message f911u;

    /* renamed from: v */
    public Drawable f912v;

    /* renamed from: w */
    public Button f913w;

    /* renamed from: x */
    public CharSequence f914x;

    /* renamed from: y */
    public Message f915y;

    /* renamed from: z */
    public Drawable f916z;

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f917a;

        /* renamed from: b */
        public final int f918b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f917a;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f918b;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.RecycleListView);
            this.f918b = obtainStyledAttributes.getDimensionPixelOffset(C0387a.C0400m.RecycleListView_paddingBottomNoButtons, -1);
            this.f917a = obtainStyledAttributes.getDimensionPixelOffset(C0387a.C0400m.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0401a implements View.OnClickListener {
        public C0401a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f905o && (message4 = alertController.f907q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f909s && (message3 = alertController.f911u) != null) {
                message = Message.obtain(message3);
            } else if (view != alertController.f913w || (message2 = alertController.f915y) == null) {
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f889R.obtainMessage(1, alertController2.f892b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public class C0402b implements NestedScrollView.C18456c {

        /* renamed from: a */
        public final /* synthetic */ View f920a;

        /* renamed from: b */
        public final /* synthetic */ View f921b;

        public C0402b(View view, View view2) {
            this.f920a = view;
            this.f921b = view2;
        }

        /* renamed from: a */
        public void mo1055a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m1572g(nestedScrollView, this.f920a, this.f921b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public class C0403c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f923a;

        /* renamed from: b */
        public final /* synthetic */ View f924b;

        public C0403c(View view, View view2) {
            this.f923a = view;
            this.f924b = view2;
        }

        public void run() {
            AlertController.m1572g(AlertController.this.f872A, this.f923a, this.f924b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public class C0404d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f926a;

        /* renamed from: b */
        public final /* synthetic */ View f927b;

        public C0404d(View view, View view2) {
            this.f926a = view;
            this.f927b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m1572g(absListView, this.f926a, this.f927b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    public class C0405e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f929a;

        /* renamed from: b */
        public final /* synthetic */ View f930b;

        public C0405e(View view, View view2) {
            this.f929a = view;
            this.f930b = view2;
        }

        public void run() {
            AlertController.m1572g(AlertController.this.f897g, this.f929a, this.f930b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0406f {

        /* renamed from: A */
        public int f932A;

        /* renamed from: B */
        public int f933B;

        /* renamed from: C */
        public int f934C;

        /* renamed from: D */
        public int f935D;

        /* renamed from: E */
        public boolean f936E = false;

        /* renamed from: F */
        public boolean[] f937F;

        /* renamed from: G */
        public boolean f938G;

        /* renamed from: H */
        public boolean f939H;

        /* renamed from: I */
        public int f940I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f941J;

        /* renamed from: K */
        public Cursor f942K;

        /* renamed from: L */
        public String f943L;

        /* renamed from: M */
        public String f944M;

        /* renamed from: N */
        public boolean f945N;

        /* renamed from: O */
        public AdapterView.OnItemSelectedListener f946O;

        /* renamed from: P */
        public C0411e f947P;

        /* renamed from: Q */
        public boolean f948Q = true;

        /* renamed from: a */
        public final Context f949a;

        /* renamed from: b */
        public final LayoutInflater f950b;

        /* renamed from: c */
        public int f951c = 0;

        /* renamed from: d */
        public Drawable f952d;

        /* renamed from: e */
        public int f953e = 0;

        /* renamed from: f */
        public CharSequence f954f;

        /* renamed from: g */
        public View f955g;

        /* renamed from: h */
        public CharSequence f956h;

        /* renamed from: i */
        public CharSequence f957i;

        /* renamed from: j */
        public Drawable f958j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f959k;

        /* renamed from: l */
        public CharSequence f960l;

        /* renamed from: m */
        public Drawable f961m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f962n;

        /* renamed from: o */
        public CharSequence f963o;

        /* renamed from: p */
        public Drawable f964p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f965q;

        /* renamed from: r */
        public boolean f966r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f967s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f968t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f969u;

        /* renamed from: v */
        public CharSequence[] f970v;

        /* renamed from: w */
        public ListAdapter f971w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f972x;

        /* renamed from: y */
        public int f973y;

        /* renamed from: z */
        public View f974z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        public class C0407a extends ArrayAdapter<CharSequence> {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f975a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0407a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f975a = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0406f.this.f937F;
                if (zArr != null && zArr[i]) {
                    this.f975a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        public class C0408b extends CursorAdapter {

            /* renamed from: a */
            public final int f977a;

            /* renamed from: b */
            public final int f978b;

            /* renamed from: c */
            public final /* synthetic */ RecycleListView f979c;

            /* renamed from: d */
            public final /* synthetic */ AlertController f980d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0408b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f979c = recycleListView;
                this.f980d = alertController;
                Cursor cursor2 = getCursor();
                this.f977a = cursor2.getColumnIndexOrThrow(C0406f.this.f943L);
                this.f978b = cursor2.getColumnIndexOrThrow(C0406f.this.f944M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f977a));
                RecycleListView recycleListView = this.f979c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f978b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0406f.this.f950b.inflate(this.f980d.f884M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        public class C0409c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AlertController f982a;

            public C0409c(AlertController alertController) {
                this.f982a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0406f.this.f972x.onClick(this.f982a.f892b, i);
                if (!C0406f.this.f939H) {
                    this.f982a.f892b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        public class C0410d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f984a;

            /* renamed from: b */
            public final /* synthetic */ AlertController f985b;

            public C0410d(RecycleListView recycleListView, AlertController alertController) {
                this.f984a = recycleListView;
                this.f985b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0406f.this.f937F;
                if (zArr != null) {
                    zArr[i] = this.f984a.isItemChecked(i);
                }
                C0406f.this.f941J.onClick(this.f985b.f892b, i, this.f984a.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0411e {
            /* renamed from: a */
            void mo1067a(ListView listView);
        }

        public C0406f(Context context) {
            this.f949a = context;
            this.f966r = true;
            this.f950b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void mo1060a(AlertController alertController) {
            View view = this.f955g;
            if (view != null) {
                alertController.mo1040n(view);
            } else {
                CharSequence charSequence = this.f954f;
                if (charSequence != null) {
                    alertController.mo1045s(charSequence);
                }
                Drawable drawable = this.f952d;
                if (drawable != null) {
                    alertController.mo1042p(drawable);
                }
                int i = this.f951c;
                if (i != 0) {
                    alertController.mo1041o(i);
                }
                int i2 = this.f953e;
                if (i2 != 0) {
                    alertController.mo1041o(alertController.mo1031d(i2));
                }
            }
            CharSequence charSequence2 = this.f956h;
            if (charSequence2 != null) {
                alertController.mo1043q(charSequence2);
            }
            CharSequence charSequence3 = this.f957i;
            if (!(charSequence3 == null && this.f958j == null)) {
                alertController.mo1038l(-1, charSequence3, this.f959k, (Message) null, this.f958j);
            }
            CharSequence charSequence4 = this.f960l;
            if (!(charSequence4 == null && this.f961m == null)) {
                alertController.mo1038l(-2, charSequence4, this.f962n, (Message) null, this.f961m);
            }
            CharSequence charSequence5 = this.f963o;
            if (!(charSequence5 == null && this.f964p == null)) {
                alertController.mo1038l(-3, charSequence5, this.f965q, (Message) null, this.f964p);
            }
            if (!(this.f970v == null && this.f942K == null && this.f971w == null)) {
                mo1061b(alertController);
            }
            View view2 = this.f974z;
            if (view2 == null) {
                int i3 = this.f973y;
                if (i3 != 0) {
                    alertController.mo1046t(i3);
                }
            } else if (this.f936E) {
                alertController.mo1048v(view2, this.f932A, this.f933B, this.f934C, this.f935D);
            } else {
                alertController.mo1047u(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1061b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f950b
                int r1 = r11.f883L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f938G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f942K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f949a
                int r4 = r11.f884M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f970v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f949a
                android.database.Cursor r4 = r10.f942K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f939H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f885N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f886O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f942K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f949a
                android.database.Cursor r5 = r10.f942K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f943L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f971w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f949a
                java.lang.CharSequence[] r3 = r10.f970v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f947P
                if (r1 == 0) goto L_0x0072
                r1.mo1067a(r0)
            L_0x0072:
                r11.f879H = r9
                int r1 = r10.f940I
                r11.f880I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f972x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f941J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f946O
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f939H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f938G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f897g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0406f.mo1061b(androidx.appcompat.app.AlertController):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    public static final class C0412g extends Handler {

        /* renamed from: b */
        public static final int f987b = 1;

        /* renamed from: a */
        public WeakReference<DialogInterface> f988a;

        public C0412g(DialogInterface dialogInterface) {
            this.f988a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f988a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    public static class C0413h extends ArrayAdapter<CharSequence> {
        public C0413h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0492q qVar, Window window) {
        this.f891a = context;
        this.f892b = qVar;
        this.f893c = window;
        this.f889R = new C0412g(qVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0387a.C0400m.AlertDialog, C0387a.C0389b.alertDialogStyle, 0);
        this.f881J = obtainStyledAttributes.getResourceId(C0387a.C0400m.AlertDialog_android_layout, 0);
        this.f882K = obtainStyledAttributes.getResourceId(C0387a.C0400m.AlertDialog_buttonPanelSideLayout, 0);
        this.f883L = obtainStyledAttributes.getResourceId(C0387a.C0400m.AlertDialog_listLayout, 0);
        this.f884M = obtainStyledAttributes.getResourceId(C0387a.C0400m.AlertDialog_multiChoiceItemLayout, 0);
        this.f885N = obtainStyledAttributes.getResourceId(C0387a.C0400m.AlertDialog_singleChoiceItemLayout, 0);
        this.f886O = obtainStyledAttributes.getResourceId(C0387a.C0400m.AlertDialog_listItemLayout, 0);
        this.f887P = obtainStyledAttributes.getBoolean(C0387a.C0400m.AlertDialog_showTitle, true);
        this.f894d = obtainStyledAttributes.getDimensionPixelSize(C0387a.C0400m.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        qVar.mo1528l(1);
    }

    /* renamed from: B */
    public static boolean m1570B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0387a.C0389b.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m1571a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1571a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m1572g(View view, View view2, View view3) {
        int i;
        int i2 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    /* renamed from: A */
    public final void mo1028A() {
        boolean z;
        boolean z2;
        boolean z3;
        ListAdapter listAdapter;
        View findViewById;
        View view;
        View findViewById2;
        View findViewById3 = this.f893c.findViewById(C0387a.C0394g.parentPanel);
        int i = C0387a.C0394g.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C0387a.C0394g.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C0387a.C0394g.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0387a.C0394g.customPanel);
        mo1051y(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup j = mo1036j(findViewById7, findViewById4);
        ViewGroup j2 = mo1036j(findViewById8, findViewById5);
        ViewGroup j3 = mo1036j(findViewById9, findViewById6);
        mo1050x(j2);
        mo1049w(j3);
        mo1052z(j);
        char c = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (j == null || j.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (j3 == null || j3.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(z3 || j2 == null || (findViewById2 = j2.findViewById(C0387a.C0394g.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f872A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f896f == null && this.f897g == null) {
                view = null;
            } else {
                view = j.findViewById(C0387a.C0394g.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(j2 == null || (findViewById = j2.findViewById(C0387a.C0394g.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f897g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view2 = this.f897g;
            if (view2 == null) {
                view2 = this.f872A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                mo1044r(j2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f897g;
        if (listView2 != null && (listAdapter = this.f879H) != null) {
            listView2.setAdapter(listAdapter);
            int i4 = this.f880I;
            if (i4 > -1) {
                listView2.setItemChecked(i4, true);
                listView2.setSelection(i4);
            }
        }
    }

    /* renamed from: b */
    public final void mo1029b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public Button mo1030c(int i) {
        if (i == -3) {
            return this.f913w;
        }
        if (i == -2) {
            return this.f909s;
        }
        if (i != -1) {
            return null;
        }
        return this.f905o;
    }

    /* renamed from: d */
    public int mo1031d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f891a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo1032e() {
        return this.f897g;
    }

    /* renamed from: f */
    public void mo1033f() {
        this.f892b.setContentView(mo1037k());
        mo1028A();
    }

    /* renamed from: h */
    public boolean mo1034h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f872A;
        return nestedScrollView != null && nestedScrollView.mo53281w(keyEvent);
    }

    /* renamed from: i */
    public boolean mo1035i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f872A;
        return nestedScrollView != null && nestedScrollView.mo53281w(keyEvent);
    }

    @C0363p0
    /* renamed from: j */
    public final ViewGroup mo1036j(@C0363p0 View view, @C0363p0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    public final int mo1037k() {
        int i = this.f882K;
        if (i == 0) {
            return this.f881J;
        }
        if (this.f888Q == 1) {
            return i;
        }
        return this.f881J;
    }

    /* renamed from: l */
    public void mo1038l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f889R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f914x = charSequence;
            this.f915y = message;
            this.f916z = drawable;
        } else if (i == -2) {
            this.f910t = charSequence;
            this.f911u = message;
            this.f912v = drawable;
        } else if (i == -1) {
            this.f906p = charSequence;
            this.f907q = message;
            this.f908r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void mo1039m(int i) {
        this.f888Q = i;
    }

    /* renamed from: n */
    public void mo1040n(View view) {
        this.f878G = view;
    }

    /* renamed from: o */
    public void mo1041o(int i) {
        this.f874C = null;
        this.f873B = i;
        ImageView imageView = this.f875D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f875D.setImageResource(this.f873B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: p */
    public void mo1042p(Drawable drawable) {
        this.f874C = drawable;
        this.f873B = 0;
        ImageView imageView = this.f875D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f875D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: q */
    public void mo1043q(CharSequence charSequence) {
        this.f896f = charSequence;
        TextView textView = this.f877F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public final void mo1044r(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f893c.findViewById(C0387a.C0394g.scrollIndicatorUp);
        View findViewById2 = this.f893c.findViewById(C0387a.C0394g.scrollIndicatorDown);
        C18196h2.m82619p2(view, i, i2);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: s */
    public void mo1045s(CharSequence charSequence) {
        this.f895e = charSequence;
        TextView textView = this.f876E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: t */
    public void mo1046t(int i) {
        this.f898h = null;
        this.f899i = i;
        this.f904n = false;
    }

    /* renamed from: u */
    public void mo1047u(View view) {
        this.f898h = view;
        this.f899i = 0;
        this.f904n = false;
    }

    /* renamed from: v */
    public void mo1048v(View view, int i, int i2, int i3, int i4) {
        this.f898h = view;
        this.f899i = 0;
        this.f904n = true;
        this.f900j = i;
        this.f901k = i2;
        this.f902l = i3;
        this.f903m = i4;
    }

    /* renamed from: w */
    public final void mo1049w(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f905o = button;
        button.setOnClickListener(this.f890S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f906p) || this.f908r != null) {
            this.f905o.setText(this.f906p);
            Drawable drawable = this.f908r;
            if (drawable != null) {
                int i = this.f894d;
                drawable.setBounds(0, 0, i, i);
                this.f905o.setCompoundDrawables(this.f908r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f905o.setVisibility(0);
            z = true;
        } else {
            this.f905o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f909s = button2;
        button2.setOnClickListener(this.f890S);
        if (!TextUtils.isEmpty(this.f910t) || this.f912v != null) {
            this.f909s.setText(this.f910t);
            Drawable drawable2 = this.f912v;
            if (drawable2 != null) {
                int i2 = this.f894d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f909s.setCompoundDrawables(this.f912v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f909s.setVisibility(0);
            z |= true;
        } else {
            this.f909s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f913w = button3;
        button3.setOnClickListener(this.f890S);
        if (!TextUtils.isEmpty(this.f914x) || this.f916z != null) {
            this.f913w.setText(this.f914x);
            Drawable drawable3 = this.f916z;
            if (drawable3 != null) {
                int i3 = this.f894d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f913w.setCompoundDrawables(this.f916z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f913w.setVisibility(0);
            z |= true;
        } else {
            this.f913w.setVisibility(8);
        }
        if (m1570B(this.f891a)) {
            if (z) {
                mo1029b(this.f905o);
            } else if (z) {
                mo1029b(this.f909s);
            } else if (z) {
                mo1029b(this.f913w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: x */
    public final void mo1050x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f893c.findViewById(C0387a.C0394g.scrollView);
        this.f872A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f872A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f877F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f896f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f872A.removeView(this.f877F);
            if (this.f897g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f872A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f872A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f897g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: y */
    public final void mo1051y(ViewGroup viewGroup) {
        View view = this.f898h;
        boolean z = false;
        if (view == null) {
            if (this.f899i != 0) {
                view = LayoutInflater.from(this.f891a).inflate(this.f899i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m1571a(view)) {
            this.f893c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f893c.findViewById(C0387a.C0394g.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f904n) {
                frameLayout.setPadding(this.f900j, this.f901k, this.f902l, this.f903m);
            }
            if (this.f897g != null) {
                ((LinearLayoutCompat.C0642b) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: z */
    public final void mo1052z(ViewGroup viewGroup) {
        if (this.f878G != null) {
            viewGroup.addView(this.f878G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f893c.findViewById(C0387a.C0394g.title_template).setVisibility(8);
            return;
        }
        this.f875D = (ImageView) this.f893c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f895e)) || !this.f887P) {
            this.f893c.findViewById(C0387a.C0394g.title_template).setVisibility(8);
            this.f875D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f893c.findViewById(C0387a.C0394g.alertTitle);
        this.f876E = textView;
        textView.setText(this.f895e);
        int i = this.f873B;
        if (i != 0) {
            this.f875D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f874C;
        if (drawable != null) {
            this.f875D.setImageDrawable(drawable);
            return;
        }
        this.f876E.setPadding(this.f875D.getPaddingLeft(), this.f875D.getPaddingTop(), this.f875D.getPaddingRight(), this.f875D.getPaddingBottom());
        this.f875D.setVisibility(8);
    }
}
