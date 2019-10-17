package com.dengjinwen.basetool.activity.designPattern.commandMode;

public class LightOffCommand implements Command {
    private Lights lights;

    public LightOffCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.off();
    }
}
