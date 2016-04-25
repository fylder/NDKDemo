#include <jni.h>

jstring Java_fylder_ndk_demo_DemoTools_test(JNIEnv *env, jobject instance) {
// TODO
    return (*env)->NewStringUTF(env, "那等在季节里的容颜如莲花的开落");
}