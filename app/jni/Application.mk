APP_STL := c++_shared # Or system, or none.
APP_CFLAGS := -fsanitize=address -fno-omit-frame-pointer
APP_LDFLAGS := -fsanitize=address
APP_ABI := armeabi-v7a
