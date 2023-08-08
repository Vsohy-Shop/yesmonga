from flask import Flask, jsonify
import subprocess

app = Flask(__name__)

@app.route('/generate_ids', methods=['GET'])
def generate_ids():
    result = subprocess.run(['java', '-cp', '.', 'IdGenerator'], capture_output=True, text=True)
    lines = result.stdout.strip().split("\n")
    x_request_id = lines[0].split(": ")[1]
    x_correlation_id = lines[1].split(": ")[1]

    return jsonify({
        'X-Request-Id': x_request_id,
        'X-Correlation-Id': x_correlation_id})

if __name__ == '__main__':
    app.run(debug=True)
