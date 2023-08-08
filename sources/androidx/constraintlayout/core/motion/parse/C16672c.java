package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.C16716u;
import androidx.constraintlayout.core.parser.C16735c;
import androidx.constraintlayout.core.parser.C16736d;
import androidx.constraintlayout.core.parser.C16738f;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;

/* renamed from: androidx.constraintlayout.core.motion.parse.c */
public class C16672c {

    /* renamed from: androidx.constraintlayout.core.motion.parse.c$a */
    public interface C16673a {
        int get(int i);
    }

    /* renamed from: androidx.constraintlayout.core.motion.parse.c$b */
    public interface C16674b {
        int get(String str);
    }

    /* renamed from: a */
    public static void m76134a(String[] strArr) {
        m76136c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    /* renamed from: b */
    public static C16716u m76135b(String str, C16674b bVar, C16673a aVar) {
        C16716u uVar = new C16716u();
        try {
            C16738f d = CLParser.m76375d(str);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                C16736d dVar = (C16736d) d.mo49153l0(i);
                String h = dVar.mo49178h();
                C16735c O0 = dVar.mo49186O0();
                int i2 = bVar.get(h);
                if (i2 == -1) {
                    PrintStream printStream = System.err;
                    printStream.println("unknown type " + h);
                } else {
                    int i3 = aVar.get(i2);
                    if (i3 == 1) {
                        uVar.mo49109d(i2, d.mo49141C(i));
                    } else if (i3 == 2) {
                        uVar.mo49107b(i2, O0.mo49183w());
                        PrintStream printStream2 = System.out;
                        printStream2.println("parse " + h + " INT_MASK > " + O0.mo49183w());
                    } else if (i3 == 4) {
                        uVar.mo49106a(i2, O0.mo49182r());
                        PrintStream printStream3 = System.out;
                        printStream3.println("parse " + h + " FLOAT_MASK > " + O0.mo49182r());
                    } else if (i3 == 8) {
                        uVar.mo49108c(i2, O0.mo49178h());
                        PrintStream printStream4 = System.out;
                        printStream4.println("parse " + h + " STRING_MASK > " + O0.mo49178h());
                    }
                }
            }
        } catch (CLParsingException e) {
            e.printStackTrace();
        }
        return uVar;
    }

    /* renamed from: c */
    public static C16716u m76136c(String str) {
        return m76135b(str, new C16670a(), new C16671b());
    }
}
