package com.google.zxing.datamatrix.encoder;

import androidx.compose.p004ui.graphics.vector.C15369g;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.zxing.datamatrix.encoder.l */
public final class C34750l extends C34741c {
    /* renamed from: b */
    public int mo102783b() {
        return 2;
    }

    /* renamed from: d */
    public int mo102785d(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - C15369g.f37993s) + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - C12361b.f30260k) + 22));
            return 2;
        } else if (c == '`') {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c <= 'Z') {
            sb.append(2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c <= 127) {
            sb.append(2);
            sb.append((char) ((c - '{') + 27));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo102785d((char) (c - 128), sb) + 2;
        }
    }
}
