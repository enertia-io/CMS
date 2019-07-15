## Charge Point Management System

### Charge Point Support

Electric charge points using the following OCPP versions are supported:

* OCPP1.2S
* OCPP1.2J
* OCPP1.5S
* OCPP1.5J
* OCPP1.6S
* OCPP1.6J

### Add a charge point

1. In order for SteVe to accept messages from a charge point, the charge point must first be registered. To add a charge point to SteVe select *Data Management* >> *Charge Points* >> *Add*. Enter the ChargeBox ID configured in the charge point and confirm.

2. The charge points must be configured to communicate with following addresses. Depending on the OCPP version of the charge point, SteVe will automatically route messages to the version-specific implementation.
    - SOAP: `http://ocpp.enertia.io/ev/services/CentralSystemService`
    - WebSocket/JSON: `ws://ocpp.enertia.io/ev/steve/websocket/CentralSystemService/<chargeBoxId>`


As soon as a heartbeat is received, you should see the status of the charge point in the Dashboard.
 
