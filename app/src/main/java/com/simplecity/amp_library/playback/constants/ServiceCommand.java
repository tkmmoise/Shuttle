package com.simplecity.amp_library.playback.constants;

public final class ServiceCommand {
    public static final String COMMAND = "com.simplecityapps.shuttle.service_command";
    public static final String TOGGLE_PLAYBACK = COMMAND + ".toggle_playback";
    public static final String PAUSE = COMMAND + ".pause";
    public static final String PLAY = COMMAND + ".play";
    public static final String PREV = COMMAND + ".prev";
    public static final String NEXT = COMMAND + ".next";
    public static final String STOP = COMMAND + ".stop";
    public static final String SHUFFLE = COMMAND + ".shuffle";
    public static final String REPEAT = COMMAND + ".repeat";
    public static final String SHUTDOWN = COMMAND + ".shutdown";
    public static final String TOGGLE_FAVORITE = COMMAND + ".toggle_favorite";

    private ServiceCommand() {}
}