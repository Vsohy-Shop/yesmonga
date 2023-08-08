package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* renamed from: androidx.emoji2.text.flatbuffer.y */
public class C19077y extends Utf8 {

    /* renamed from: b */
    public static final ThreadLocal<C19078a> f48543b = new C19076x(new C19075w());

    /* renamed from: androidx.emoji2.text.flatbuffer.y$a */
    public static class C19078a {

        /* renamed from: a */
        public final CharsetEncoder f48544a = StandardCharsets.UTF_8.newEncoder();

        /* renamed from: b */
        public final CharsetDecoder f48545b = StandardCharsets.UTF_8.newDecoder();

        /* renamed from: c */
        public CharSequence f48546c = null;

        /* renamed from: d */
        public ByteBuffer f48547d = null;
    }

    /* renamed from: g */
    public static /* synthetic */ C19078a m89336g() {
        return new C19078a();
    }

    /* renamed from: a */
    public String mo56047a(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = f48543b.get().f48545b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    /* renamed from: b */
    public void mo56048b(CharSequence charSequence, ByteBuffer byteBuffer) {
        C19078a aVar = f48543b.get();
        if (aVar.f48546c != charSequence) {
            mo56049c(charSequence);
        }
        byteBuffer.put(aVar.f48547d);
    }

    /* renamed from: c */
    public int mo56049c(CharSequence charSequence) {
        CharBuffer charBuffer;
        C19078a aVar = f48543b.get();
        int length = (int) (((float) charSequence.length()) * aVar.f48544a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f48547d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f48547d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f48547d.clear();
        aVar.f48546c = charSequence;
        if (charSequence instanceof CharBuffer) {
            charBuffer = (CharBuffer) charSequence;
        } else {
            charBuffer = CharBuffer.wrap(charSequence);
        }
        CoderResult encode = aVar.f48544a.encode(charBuffer, aVar.f48547d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        aVar.f48547d.flip();
        return aVar.f48547d.remaining();
    }
}
