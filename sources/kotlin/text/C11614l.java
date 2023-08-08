package kotlin.text;

import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.text.l */
public final class C11614l {
    @C12579k

    /* renamed from: a */
    public static final C11614l f28890a = new C11614l();
    @C12579k
    @C11287e

    /* renamed from: b */
    public static final Regex f28891b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f28891b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}
