package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: a */
    public static final StackTraceElement[] f56915a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    @C0363p0
    private Exception exception;
    private C22108c key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: b */
    public static void m100885b(List<Throwable> list, Appendable appendable) {
        try {
            m100886c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m100886c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).mo65898i(appendable);
            } else {
                m100887d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m100887d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void mo65891a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo65892e()) {
                mo65891a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: e */
    public List<Throwable> mo65892e() {
        return this.causes;
    }

    @C0363p0
    /* renamed from: f */
    public Exception mo65893f() {
        return this.exception;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public List<Throwable> mo65895g() {
        ArrayList arrayList = new ArrayList();
        mo65891a(this, arrayList);
        return arrayList;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            str = ", " + this.dataClass;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            str2 = ", " + this.dataSource;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb.append(str3);
        List<Throwable> g = mo65895g();
        if (g.isEmpty()) {
            return sb.toString();
        }
        if (g.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(g.size());
            sb.append(" root causes:");
        }
        for (Throwable next : g) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo65897h(String str) {
        List<Throwable> g = mo65895g();
        int size = g.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Throwable th = g.get(i);
            i = i2;
        }
    }

    /* renamed from: i */
    public final void mo65898i(Appendable appendable) {
        m100887d(this, appendable);
        m100885b(mo65892e(), new C22148a(appendable));
    }

    /* renamed from: j */
    public void mo65899j(C22108c cVar, DataSource dataSource2) {
        mo65900k(cVar, dataSource2, (Class<?>) null);
    }

    /* renamed from: k */
    public void mo65900k(C22108c cVar, DataSource dataSource2, Class<?> cls) {
        this.key = cVar;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    /* renamed from: l */
    public void mo65901l(@C0363p0 Exception exc) {
        this.exception = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        mo65898i(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f56915a);
        this.causes = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo65898i(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C22148a implements Appendable {

        /* renamed from: c */
        public static final String f56916c = "";

        /* renamed from: d */
        public static final String f56917d = "  ";

        /* renamed from: a */
        public final Appendable f56918a;

        /* renamed from: b */
        public boolean f56919b = true;

        public C22148a(Appendable appendable) {
            this.f56918a = appendable;
        }

        @C0359n0
        /* renamed from: a */
        public final CharSequence mo65905a(@C0363p0 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f56919b) {
                this.f56919b = false;
                this.f56918a.append(f56917d);
            }
            if (c == 10) {
                z = true;
            }
            this.f56919b = z;
            this.f56918a.append(c);
            return this;
        }

        public Appendable append(@C0363p0 CharSequence charSequence) throws IOException {
            CharSequence a = mo65905a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(@C0363p0 CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = mo65905a(charSequence);
            boolean z = false;
            if (this.f56919b) {
                this.f56919b = false;
                this.f56918a.append(f56917d);
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f56919b = z;
            this.f56918a.append(a, i, i2);
            return this;
        }
    }
}
