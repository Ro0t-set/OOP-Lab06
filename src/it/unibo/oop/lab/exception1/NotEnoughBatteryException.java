package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final double batteryLevel;
	private final double requered;
	
	
	NotEnoughBatteryException(final double batteryLevel, final double movement_delta_consumption){
		this.batteryLevel = batteryLevel;
		this.requered = movement_delta_consumption;
		
	}


	@Override
	public String toString() {
		return "NotEnoughBatteryException [batteryLevel=" + batteryLevel + ", requered=" + requered + "]";
	}


    @Override
    public String getMessage() {
        return this.toString();
    }
	
	
	

}
