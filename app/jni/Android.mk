LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := asan-test
LOCAL_SRC_FILES := AsanTest.cpp
LOCAL_ARM_MODE := arm
LOCAL_LDLIBS += -llog
include $(BUILD_SHARED_LIBRARY)



