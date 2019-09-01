/**
 * Client endPoint
 */

/**
 * Function that creates a new websocket connection.
 * After creating the connection assigns a function to the connection events: onmessage. 
 */
function wsInit() {
	// Let us open a web socket
	//@TODO
}

/**
 * This function is called when a message is received by the client end point
 * 
 * @param evt Event that contains the message data. Use evt.data to get the
 * message.
 */
function onMessage(evt){
	//@TODO: var device=.....	
	var status = device.innerHTML; 
	var newStatus = (status == 'ON') ? 'OFF' : 'ON';
	
	//@TODO
}

window.onload = wsInit;