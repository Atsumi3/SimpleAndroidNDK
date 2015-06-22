#include <string.h>
#include <jni.h>
 
jstring Java_in_nuko_test_simplendk_MainActivity_helloWorld(JNIEnv* env, jobject javaThis){
    return (*env)->NewStringUTF(env, "Hello World!.");
}