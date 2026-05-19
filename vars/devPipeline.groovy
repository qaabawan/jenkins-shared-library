def call() {
    echo 'Running Dev Stage: Data Ingestion and Training...'
    sh '''
        cd /home/kaaba/mlops_assignment
        /home/kaaba/mlops_assignment/venv/bin/python train.py
    '''
    echo 'Model evaluation completed successfully. Assigned alias: Challenger.'
}
