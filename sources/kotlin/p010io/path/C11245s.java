package kotlin.p010io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.C11665v0;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;

@C11665v0(version = "1.7")
@C11241r
/* renamed from: kotlin.io.path.s */
public interface C11245s {
    /* renamed from: a */
    void mo22668a(@C12579k C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    /* renamed from: b */
    void mo22669b(@C12579k C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    /* renamed from: c */
    void mo22670c(@C12579k C11304p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    /* renamed from: d */
    void mo22671d(@C12579k C11304p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
